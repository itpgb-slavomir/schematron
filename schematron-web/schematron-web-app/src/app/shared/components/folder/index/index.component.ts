import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, NavigationStart } from '@angular/router';
import { DynFormApiService, UxDynFormModelArray, DynFormApi, UxDynFormModel } from '@eui/dynamic-forms';
import { FolderService } from 'src/app/shared/api-client/api/folder.service';
import { Folder } from 'src/app/shared/api-client/model/folder';
import { LocalStorageService } from 'src/app/shared/services/local-storage.service';
import { Subscription } from 'rxjs';
import { Observable, BehaviorSubject, of, forkJoin, delay, ObservableInput, take } from 'rxjs';

@Component({
	selector: 'sx-folder-index',
	templateUrl: './index.component.html',
	styleUrls: ['./index.component.scss']
})
export class SXFolderIndexComponent implements OnInit {

	public isBlocked: boolean = false;

	public storage: Map<string, BehaviorSubject<string>> = new Map();

	public form: DynFormApi;

	private subscriptions: Subscription[] = [];

	constructor() { }

	ngOnInit(): void {
	}

}
