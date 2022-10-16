import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { DashboardComponent } from './features/dashboard/dashboard.component';

import { SXCreateWizardComponent } from './shared/components/create-wizard/index.component';

import { SXDocumentBrowseComponent } from './shared/components/document/browse/browse.component';
import { SXDocumentCreateComponent } from './shared/components/document/create/create.component';
import { SXDocumentEditComponent } from './shared/components/document/edit/edit.component';
import { SXDocumentDetailComponent } from './shared/components/document/detail/detail.component';
import { SXFolderSearchComponent } from './shared/components/folder/search/search.component';
import { SXDocumentUploadComponent } from './shared/components/document/upload/upload.component';

import { SXFolderBrowseComponent } from './shared/components/folder/browse/browse.component';
import { SXFolderCreateComponent } from './shared/components/folder/create/create.component';
import { SXFolderEditComponent } from './shared/components/folder/edit/edit.component';

import { SXSchemaCreateComponent } from './shared/components/schema/create/create.component';
import { SxSchemaEditComponent } from './shared/components/schema/edit/edit.component';
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
		path: 'create',
		component: SXCreateWizardComponent
	},

	{
		path: 'document',
		component: SXDocumentBrowseComponent
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
		component: SXFolderBrowseComponent,
	},

	{
		path: 'folder/search',
		component: SXFolderSearchComponent
	},

	{
		path: 'folder/create',
		component: SXFolderCreateComponent
	},

	{
		path: 'folder/edit',
		component: SXFolderEditComponent
	},

	{
		path: 'folder/:uuid',
		component: SXDocumentBrowseComponent
	},

	{
		path: 'document/create',
		component: SXDocumentCreateComponent
	},

	{
		path: 'document/edit',
		component: SXDocumentEditComponent
	},


	{
		path: 'document/edit/:uuid',
		component: SXDocumentEditComponent
	},

	{
		path: 'document/detail/:uuid',
		component: SXDocumentDetailComponent
	},

	{
		path: 'schema/create',
		component: SXSchemaCreateComponent
	},

	{
		path: 'schema/edit',
		component: SxSchemaEditComponent
	},

	{
		path: 'schema/edit/:uuid',
		component: SxSchemaEditComponent
	},

	{
		path: 'schema/detail/:uuid',
		component: SxSchemaViewComponent
	},

	{
		path: 'upload',
		component: SXUploadComponent
	},
];

@NgModule({
	imports: [
		RouterModule.forRoot(routes),
	],
})
export class AppRoutingModule { }
