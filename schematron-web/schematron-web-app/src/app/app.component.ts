import { Component, OnDestroy, OnInit } from '@angular/core';
import { Store } from '@ngrx/store';
import {
	getUserState,
	UserState,
} from '@eui/core';
import { Observable, Subscription } from 'rxjs';

@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
})
export class AppComponent implements OnInit, OnDestroy {

	userInfos: UserState;

	userState: Observable<UserState>;

	subs: Subscription[] = [];

	toolbarMenuItems = [
		{
			label: 'dashboard',
			url: ['', 'dashboard'],
			iconClass: ''
		},

		{
			label: 'Space',
			url: ['', 'space'],
			iconClass: '',
			children: [
				{
					label: 'Browse',
					url: ['', 'folder'],
					iconClass: ''
				},

				{
					label: 'Create',
					url: ['', 'create-wizard'],
					iconClass: '',

					children: [
						{
							label: 'Create Space',
							url: ['', 'space', 'edit'],
							iconClass: ''
						},
						{
							label: 'Create Folder',
							url: ['', 'folder', 'edit'],
							iconClass: ''
						},
						{
							label: 'Create Document',
							url: ['', 'folder', 'document', 'edit'],
							iconClass: ''
						},
						{
							label: 'Create Schema',
							url: ['', 'folder', 'schema', 'edit'],
							iconClass: ''
						}
					]
				},

				{
					label: 'Search',
					url: ['', 'folder', 'search'],
					iconClass: ''
				},

				{
					label: 'Upload',
					url: ['', 'folder', 'upload'],
					iconClass: ''
				},
			]
		},
		{
			label: 'Jobs',
			url: ['', 'workflow'],
			iconClass: ''
		},
	];

	constructor(
		private store: Store<any>
	) {
		this.userState = this.store.select(getUserState);
		this.subs.push(this.userState.subscribe((user: UserState) => {
			this.userInfos = { ...user };
		}));
	}

	ngOnInit() {
	}

	ngOnDestroy() {
		this.subs.forEach((s: Subscription) => s.unsubscribe());
	}
}
