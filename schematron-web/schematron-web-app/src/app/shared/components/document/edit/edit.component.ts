import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, NavigationStart } from '@angular/router';
import { DynFormApiService, UxDynFormModelArray, DynFormApi, UxDynFormModel } from '@eui/dynamic-forms';
import { FolderService } from 'src/app/shared/api-client/api/folder.service';
import { Document } from 'src/app/shared/api-client/model/document';
import { LocalStorageService } from 'src/app/shared/services/local-storage.service';
import { Subscription } from 'rxjs';
import { Observable, BehaviorSubject, of, forkJoin, delay, ObservableInput, take } from 'rxjs';
import SXEditDocumentFormMetaData from './edit.form';

@Component({
	selector: 'sx-document-edit',
	templateUrl: './edit.component.html',
	styleUrls: ['./edit.component.scss']
})
export class SXDocumentEditComponent implements OnInit {

	public isBlocked: boolean = false;

	public form: DynFormApi;

	private subscriptions: Subscription[] = [];

	public UUID: string = '2f3fcf12-4d41-11ed-84c0-06b3e2db0229';

	constructor(
		private formApiService: DynFormApiService,
		private router: Router,
		private activatedRoute: ActivatedRoute,
		private localStorageService: LocalStorageService,
		private service: FolderService
	) {

		this.subscriptions.push(

			this.localStorageService

				.getItem(this.UUID, new Document())
				.subscribe(

					(event: any) => {
						this.onStorageChange(event);
					},
					(error: any) => {
						this.onError(error);
					}
				)
		);

		this.form = this.formApiService.createForm(SXEditDocumentFormMetaData);

		this.subscriptions.push(
			this.form.isReady
				.subscribe(
					(event: any) => {
						this.onFormReady(event);
					},

					(error: any) => {
						this.onError(error);
					})
		);

		this.subscriptions.push(
			this.activatedRoute.paramMap
				.subscribe(

					(event: any) => {

						this.onParamMapResolved(event);
					},

					(error: any) => {
						this.onError(error);
					})
		);

		this.subscriptions.push(
			this.activatedRoute.queryParams
				.subscribe(

					(event: any) => {

						this.onQueryResolved(event);
					},

					(error: any) => {
						this.onError(error);
					})
		);
	}

	private onError(event): void {
		console.error(event);
	}

	private onQueryResolved(event): void {
		console.info(event);
	}

	private onParamMapResolved(event): void {
		console.info(event);
	}

	private onFormReady(event): void {

		if (event) {

			this.subscriptions.push(

				this.form.getFormModelChanges().subscribe(
					(event: any) => {
						this.onModelChanges(event);
					},
					(error: any) => {
						this.onError(error);
					}
				)

			);
		}

	}

	private onModelChanges(event): void {
		console.info(event);
	}

	private onStorageChange(event): void {
		console.info(event);
	}


	private onItemChange(event): void {

		let promises = [];

		//console.info(event);
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
