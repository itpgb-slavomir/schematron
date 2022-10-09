import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './features/dashboard/dashboard.component';

import { SXCreateWizardComponent } from './shared/components/create-wizard/index.component';

import { SXDocumentBrowseComponent } from './shared/components/document/browse/browse.component';
import { SXDocumentCreateComponent } from './shared/components/document/create/create.component';
import { SXDocumentEditComponent } from './shared/components/document/edit/edit.component';
import { SXDocumentDetailComponent } from './shared/components/document/detail/detail.component';

import { SXSchemaCreateComponent } from './shared/components/schema/create/create.component';

const routes: Routes = [

	{
		path: '',
		redirectTo: 'dashboard',
		pathMatch: 'full'
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
		path: 'documents',
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
		component: SXCreateWizardComponent
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
		path: 'schema/create',
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
