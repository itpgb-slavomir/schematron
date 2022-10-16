import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, NavigationStart } from '@angular/router';
import { DynFormApiService, UxDynFormModelArray, DynFormApi, UxDynFormModel } from '@eui/dynamic-forms';
import { FolderService } from 'src/app/shared/api-client/api/folder.service';
import { Folder } from 'src/app/shared/api-client/model/folder';
import { LocalStorageService } from 'src/app/shared/services/local-storage.service';
import { Subscription } from 'rxjs';
import { Observable, BehaviorSubject, of, forkJoin, delay, ObservableInput, take } from 'rxjs';
import SXEditSchemaFormMetaData from './edit.form';

@Component({
	selector: 'sx-schema-edit',
	templateUrl: './edit.component.html',
	styleUrls: ['./edit.component.scss']
})
export class SxSchemaEditComponent implements OnInit {

	private metaData: UxDynFormModelArray = SXEditSchemaFormMetaData;

	public form: DynFormApi;

	private subscriptions: Subscription[] = [];

	constructor(
		private formApiService: DynFormApiService,
		private router: Router,
		private activatedRoute: ActivatedRoute,
		private localStorageService: LocalStorageService,
		private service: FolderService
	) {
		this.form = this.formApiService.createForm(this.metaData);
	}

	private onItemChange(item): void {

	}

	ngOnDestroy() {
		for (let i = 0; i < this.subscriptions.length; i++) {
			this.subscriptions[i].unsubscribe();
		}
	}

	ngOnInit(): void {
	}

}
