import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { DashboardComponent } from './features/dashboard/dashboard.component';

import { SXCreateWizardComponent } from './shared/components/create-wizard/index.component';

import { SXDocumentBrowseComponent } from './shared/components/document/browse/browse.component';
import { SXDocumentCreateComponent } from './shared/components/document/create/create.component';
import { SXDocumentDetailComponent } from './shared/components/document/detail/detail.component';
import { SXDocumentEditComponent } from './shared/components/document/edit/edit.component';
import { SXDocumentIndexComponent } from './shared/components/document/index/index.component';
import { SXDocumentUploadComponent } from './shared/components/document/upload/upload.component';

import { SXFolderSearchComponent } from './shared/components/folder/search/search.component';


import { SXFolderBrowseComponent } from './shared/components/folder/browse/browse.component';
import { SXFolderCreateComponent } from './shared/components/folder/create/create.component';
import { SXFolderEditComponent } from './shared/components/folder/edit/edit.component';
import { SXFolderIndexComponent } from './shared/components/folder/index/index.component';

import { SXSchemaCreateComponent } from './shared/components/schema/create/create.component';
import { SxSchemaEditComponent } from './shared/components/schema/edit/edit.component';
import { SXSchemaIndexComponent } from './shared/components/schema/index/index.component';
import { SxSchemaViewComponent } from './shared/components/schema/view/view.component';

import { SXUploadComponent } from './shared/components/upload/upload.component';

const routes: Routes = [

	{
		path: '',
		component: DashboardComponent
	},

	{
		path: 'dashboard',
		component: DashboardComponent
	},

	{
		path: 'data',
		component: SXDocumentBrowseComponent
	},
	{
		path: 'reports',
		component: SXDocumentBrowseComponent
	},

	{
		path: 'templates',
		component: SXDocumentBrowseComponent
	},

	{
		path: 'folder',
		component: SXFolderIndexComponent,

		children: [
			{
				path: '',
				component: SXFolderBrowseComponent
			},
			{
				path: 'search',
				component: SXFolderSearchComponent
			},

			{
				path: 'create',
				component: SXFolderCreateComponent
			},

			{
				path: 'edit',
				component: SXFolderEditComponent
			},
			{
				path: ':uuid',
				component: SXFolderEditComponent
			},
			{
				path: 'create',
				component: SXFolderEditComponent
			},

			{
				path: 'document',
				component: SXDocumentIndexComponent,
				children: [

					{
						path: 'browse',
						component: SXDocumentBrowseComponent
					},

					{
						path: 'create',
						component: SXDocumentCreateComponent
					},

					{
						path: 'example',
						component: SXDocumentDetailComponent
					},

					{
						path: 'edit',
						component: SXDocumentEditComponent
					},

					{
						path: 'edit/:uuid',
						component: SXDocumentEditComponent
					},

					{
						path: 'detail/:uuid',
						component: SXDocumentDetailComponent
					},

					{
						path: 'upload',
						component: SXUploadComponent
					},
				]
			},


			{
				path: 'schema',
				component: SXSchemaIndexComponent,
				children: [
					{
						path: 'create',
						component: SXSchemaCreateComponent
					},

					{
						path: 'edit',
						component: SxSchemaEditComponent
					},

					{
						path: 'edit/:uuid',
						component: SxSchemaEditComponent
					},

					{
						path: 'detail/:uuid',
						component: SxSchemaViewComponent
					},
				]
			},

		]
	},
];

@NgModule({
	imports: [
		RouterModule.forRoot(routes),
	],
})
export class AppRoutingModule { }
