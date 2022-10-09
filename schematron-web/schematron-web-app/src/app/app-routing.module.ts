import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SharedModule } from './shared/shared.module';

//import { IndexComponent as CreateWizardComponent } from './shared/components/create-wizard/index/index.component';
//
//import { BrowseComponent as DocumentBrowseComponent } from './shared/components/document/browse/browse.component';
//import { DetailComponent as DocumentDetailComponent } from './shared/components/document/detail/detail.component';
//import { SearchComponent as DocumentSearchComponent } from './shared/components/document/search/search.component';
//import { EditComponent as DocumentEditComponent } from './shared/components/document/edit/edit.component';
//import { CreateComponent as DocumentCreateComponent } from './shared/components/document/create/create.component';

const routes: Routes = [

	{
		path: '',
	},
	/*
	{
		path: 'create',
		component: CreateWizardComponent
	},

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
		SharedModule,
		RouterModule.forRoot(routes),
	],
})
export class AppRoutingModule { }
