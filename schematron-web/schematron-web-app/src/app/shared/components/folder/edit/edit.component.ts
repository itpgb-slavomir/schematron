import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, NavigationStart } from '@angular/router';
import { DynFormApiService, UxDynFormModelArray, DynFormApi, UxDynFormModel } from '@eui/dynamic-forms';
import { FolderService } from 'src/app/shared/api-client/api/folder.service';
import { Folder } from 'src/app/shared/api-client/model/folder';
import { LocalStorageService } from 'src/app/shared/services/local-storage.service';
import { Subscription } from 'rxjs';
import { Observable, BehaviorSubject, of, forkJoin, delay, ObservableInput, take } from 'rxjs';
import SXEditFolderFormMetaData from './edit.form';

@Component({
	selector: 'sx-folder-edit',
	templateUrl: './edit.component.html',
	styleUrls: ['./edit.component.scss']
})
export class SXFolderEditComponent implements OnInit {

	public isBlocked: boolean = false;

	public storage: Map<string, BehaviorSubject<string>> = new Map();

	public form: DynFormApi;

	private subscriptions: Subscription[] = [];

	constructor(
		private formApiService: DynFormApiService,
		private router: Router,
		private activatedRoute: ActivatedRoute,
		private localStorageService: LocalStorageService,
		private service: FolderService
	) {
		this.form = this.formApiService.createForm(SXEditFolderFormMetaData);
		console.log(localStorageService.getItem(''))

		this.form.getFieldData(this.form.getFrameId(), 'folder')
			.subscribe(
				(event: any) => {
					console.log(event);
				},
				(error: any) => {
					console.log(event);
				}
			);

		this.subscriptions.push(
			this.form.subEvent().subscribe(
				(event: any) => {
					this.onFormChange(event);
				},
				(error: any) => {
					this.onFormChange(event);
				}
			)
		);


		this.subscriptions.push(
			router.events.subscribe(
				event => {
					this.onRouterChange(event);
				},
				(error: any) => {
					this.onRouterChange(event);
				}
			)
		);

		this.subscriptions.push(
			this.activatedRoute.queryParams.subscribe(
				(event: any) => {
					this.onRouterChange(event);
				},
				(error: any) => {
					this.onRouterChange(event);
				}
			)
		);
		/*

		this.observers.push();
		//this.observers.push(this.form.isReady);
		//this.observers.push(this.form.subEvent());

		for (let i = 0; i < this.observers.length; i++) {
			this.subscriptions.push(this.observers[i].subscribe());
		}

		forkJoin(this.observers)
			.subscribe(
				response => {
					console.log(response);
					this.load();
				},
				error => {
					console.log(error);
				});
				*/
	}

	private onFormState(event): void {
		this.subscriptions.push(
			this.form.getFormState().subscribe(
				(event: any) => {
					this.onFormState(event);
				},
				(error: any) => {
					this.onFormState(event);
				}
			)
		);
		this.subscriptions.push(
			this.form.getFormModelChanges().subscribe(
				(event: any) => {
					this.ongFormModelChangesChange(event);
				},
				(error: any) => {
					this.ongFormModelChangesChange(event);
				}
			)
		);
	}

	private onFormChange(event): void {

		console.log('onFormChange', event);
	}

	private ongFormModelChangesChange(event): void {

		console.log('onFormChange', event);
	}

	private onRouterChange(event) {
		console.log('onRouterChange', event);
	}
	private onQueryParamChange(event) {
		console.log('onQueryParamChange', event);
	}

	private onItemChange(item): void {

		let promises = [];
		console.log('onItemChnage', item);
		/*
		if (this.item.getValue().id !== null) {
			promises.push(this.service.getFolder(this.item.getValue().id)
				.toPromise()
				.then((response: Folder) => {
					this.item.next(response);
				}));
		}
	
		Promise.all(promises)
	
			.then((response) => {
				console.log(response);
			})
	
			.catch((error) => {
				console.log(error)
			})
	
			.finally(() => {
				this.euiLoading = false;
			});
		*/
	}

	ngOnDestroy() {
		console.log('ngOnDestroy', this.subscriptions);
		for (let i = 0; i < this.subscriptions.length; i++) {
			this.subscriptions[i].unsubscribe();
		}
	}

	ngOnInit(): void {
	}
}
