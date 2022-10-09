import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { TranslateModule } from '@ngx-translate/core';
import { UxAllModule } from '@eui/components/legacy';
import { EuiAllModule } from '@eui/components';

@NgModule({
	imports: [
		CommonModule,
		FormsModule,
		ReactiveFormsModule,
		RouterModule,
		UxAllModule,
		EuiAllModule,
		TranslateModule,
	],
	declarations: [
		
	],
	exports: [
		CommonModule,
		FormsModule,
		ReactiveFormsModule,
		RouterModule,
		UxAllModule,
		EuiAllModule,
		TranslateModule
	]
})
export class SharedModule { }
