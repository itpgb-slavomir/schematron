import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { TranslateModule } from '@ngx-translate/core';
import { UxAllModule } from '@eui/components/legacy';
import { EuiAllModule } from '@eui/components';
import { ApiModule } from './api-client/api.module';

import { SXCreateWizardComponent } from './components/create-wizard/index.component';

import { SXDocumentCreateComponent } from './components/document/create/create.component';
import { SXDocumentBrowseComponent } from './components/document/browse/browse.component';
import { SXDocumentDetailComponent } from './components/document/detail/detail.component';
import { SXDocumentEditComponent } from './components/document/edit/edit.component';
import { SXDocumentSearchComponent } from './components/document/search/search.component';
import { SXDocumentUploadComponent } from './components/document/upload/upload.component';

import { SXFolderCreateComponent } from './components/folder/create/create.component';

import { SXNamespaceBrowseComponent } from './components/namespace/browse/browse.component';
import { SXNamespaceCreateComponent } from './components/namespace/create/create.component';
import { SXNamespaceDetailComponent } from './components/namespace/detail/detail.component';
import { SXNamespaceEditComponent } from './components/namespace/edit/edit.component';
import { SXNamespaceSearchComponent } from './components/namespace/search/search.component';

import { SxSchemaBrowseComponent } from './components/schema/browse/browse.component';
import { SXSchemaCreateComponent } from './components/schema/create/create.component';
import { SxSchemaEditComponent } from './components/schema/edit/edit.component';
import { SxSchemaSearchComponent } from './components/schema/search/search.component';
import { SxSchemaViewComponent } from './components/schema/view/view.component';


@NgModule({
	imports: [
		CommonModule,
		FormsModule,
		ReactiveFormsModule,
		RouterModule,
		UxAllModule,
		EuiAllModule,
		TranslateModule,
		ApiModule,
	],
	declarations: [
		SXCreateWizardComponent,

		SXDocumentBrowseComponent,
		SXDocumentCreateComponent,
		SXDocumentDetailComponent,
		SXDocumentEditComponent,
		SXDocumentSearchComponent,
		SXDocumentUploadComponent,

		SXFolderCreateComponent,

		SXNamespaceBrowseComponent,
		SXNamespaceCreateComponent,
		SXNamespaceDetailComponent,
		SXNamespaceEditComponent,
		SXNamespaceSearchComponent,

		SxSchemaBrowseComponent,
		SXSchemaCreateComponent,
		SxSchemaEditComponent,
		SxSchemaSearchComponent,
		SxSchemaViewComponent,
  
	],
	exports: [
		CommonModule,
		FormsModule,
		ReactiveFormsModule,
		RouterModule,
		UxAllModule,
		EuiAllModule,
		TranslateModule,
		ApiModule,

		SXCreateWizardComponent,

		SXDocumentBrowseComponent,
		SXDocumentCreateComponent,
		SXDocumentDetailComponent,
		SXDocumentEditComponent,
		SXDocumentSearchComponent,
		SXDocumentUploadComponent,

		SXFolderCreateComponent,

		SXNamespaceBrowseComponent,
		SXNamespaceCreateComponent,
		SXNamespaceDetailComponent,
		SXNamespaceEditComponent,
		SXNamespaceSearchComponent,

		SxSchemaBrowseComponent,
		SXSchemaCreateComponent,
		SxSchemaEditComponent,
		SxSchemaSearchComponent,
		SxSchemaViewComponent
	]
})
export class SharedModule { }
