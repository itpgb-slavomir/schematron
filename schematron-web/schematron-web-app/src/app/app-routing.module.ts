import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { DashboardComponent } from './features/dashboard/dashboard.component';

import { SXCreateWizardComponent } from './shared/components/create-wizard/index.component';

import { SXDocumentBrowseComponent } from './shared/components/document/browse/browse.component';
import { SXDocumentCreateComponent } from './shared/components/document/create/create.component';
import { SXDocumentEditComponent } from './shared/components/document/edit/edit.component';
import { SXDocumentDetailComponent } from './shared/components/document/detail/detail.component';

import { SXSchemaCreateComponent } from './shared/components/schema/create/create.component';

import { SXFolderBrowseComponent } from './shared/components/folder/browse/browse.component';
import { SXFolderCreateComponent } from './shared/components/folder/create/create.component';
import { SXFolderEditComponent } from './shared/components/folder/edit/edit.component';

const routes: Routes = [

	{
		path: '',
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
		path: 'folder/create',
		component: SXFolderCreateComponent
	},

	{
		path: 'folder/edit',
		component: SXFolderEditComponent
	},

	{
		path: 'folder',
		component: SXFolderBrowseComponent,
	},

	{
		path: 'folder/:uuid',
		component: SXDocumentBrowseComponent
	},

	{
		path: 'document/new',
		component: SXDocumentCreateComponent
	},

	{
		path: 'document/create',
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

	/*
		{
			path: 'document',
			component: DocumentBrowseComponent
		},
		{
			path: 'document/create',
			component: DocumentCreateComponent,
		},
		{
			path: 'document/modify/:id',
			component: DocumentEditComponent,
		},
		{
			path: 'document/search',
			component: DocumentSearchComponent,
		},
		{
			path: 'document/:id',
			component: DocumentDetailComponent,
		},
		/*
			{
				path: 'schema',
				loadChildren: () => import('./shared/schema/schema.module').then(m => m.SchemaModule)
			},
			{
				path: 'create',
				loadChildren: () => import('./shared/create-wizard/create-wizard.module').then(m => m.CreateWizardModule)
			},
			{
				path: 'attribute',
				loadChildren: () => import('./shared/attribute/attribute.module').then(m => m.AttributeModule)
			},
			{
				path: 'namespace',
				loadChildren: () => import('./shared/namespace/namespace.module').then(m => m.NamespaceModule)
			},
			{
				path: 'element',
				loadChildren: () => import('./shared/element/element.module').then(m => m.ElementModule)
			},
			{
				path: 'attribute',
				loadChildren: () => import('./shared/attribute/attribute.module').then(m => m.AttributeModule)
			},*/
];

@NgModule({
	imports: [
		RouterModule.forRoot(routes),
	],
})
export class AppRoutingModule { }
