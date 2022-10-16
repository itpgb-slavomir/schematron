import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, NavigationStart } from '@angular/router';
import { DynFormApiService, UxDynFormModelArray, DynFormApi, UxDynFormModel } from '@eui/dynamic-forms';
import { FolderService } from 'src/app/shared/api-client/api/folder.service';
import { Folder } from 'src/app/shared/api-client/model/folder';
import { LocalStorageService } from 'src/app/shared/services/local-storage.service';
import { Subscription } from 'rxjs';
import { Observable, BehaviorSubject, of, forkJoin, delay, ObservableInput, take } from 'rxjs';

@Component({
	selector: 'sx-document-edit',
	templateUrl: './edit.component.html',
	styleUrls: ['./edit.component.scss']
})
export class SXDocumentEditComponent implements OnInit {

	public isBlocked: boolean = true;

	metaData: UxDynFormModelArray = [
		{
			"fieldType": "formGroup",
			"layout": {
				"class": "col-12",
				"style": {}
			},
			"context": {
				"key": "groupName",
				"type": "_uxFieldSetContainer",
				"inputs": {
					"label": "Folder"
				}
			},
			"children": [
				{
					"fieldType": "formControl",
					"layout": {
						"class": "col-12",
						"style": {}
					},
					"context": {
						"key": "child1",
						"type": "_uxTextInput",
						"inputs": {
							"label": "Parent",
							"placeHolder": "Root folder"
						}
					}
				},
				{
					"fieldType": "formControl",
					"layout": { "class": "col-12", "style": {} },
					"context": {
						"key": "child2",
						"type": "_uxTextInput",
						"inputs": {
							"label": "Name",
							"placeHolder": ""
						}
					}
				},
			]
		},
		{
			"fieldType": "container",
			"layout": {
				"class": "col-12",
				"style": {}
			},
			"context": {
				"type": "_uxButton",
				"inputs": {
					"block": false,
					"disabled": false,
					"onClickExtraData": "asdasd",
					"flat": false,
					"label": "Save",
					"large": false,
					"outline": false,
					"secondary": false,
					"small": false,
					"typeClass": "info"
				}
			}
		}
	];

	initialData: object = {
		hello: '',
	};

	public form: DynFormApi;

	private observers: Record<string, ObservableInput<any>> = {};

	private subscriptions: Subscription[] = [];

	public euiLoading: boolean = true;

	public storage: Map<string, BehaviorSubject<string>> = new Map();

	public item: BehaviorSubject<Folder>;

	constructor(
		private formApiService: DynFormApiService,
		private router: Router,
		private activatedRoute: ActivatedRoute,
		private localStorageService: LocalStorageService,
		private service: FolderService
	) {
		this.item = new BehaviorSubject<Folder>(new Folder());
		this.subscriptions.push(
			this.item.subscribe(
				(event: any) => {
					this.onItemChange(event);
				},
				(error: any) => {
					this.onItemChange(error);
				}
			)
		);
		this.form = this.formApiService.createForm(this.metaData, this.initialData);
	}

	private onItemChange(item): void {

		let promises = [];
		this.isBlocked = false;
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
