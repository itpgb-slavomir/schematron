import { Component, OnInit } from '@angular/core';
import { DynFormApiService, UxDynFormModelArray, DynFormApi, UxDynFormModel } from '@eui/dynamic-forms';

@Component({
	selector: 'sx-folder-edit',
	templateUrl: './edit.component.html',
	styleUrls: ['./edit.component.scss']
})
export class SXFolderEditComponent implements OnInit {

	metaData: UxDynFormModelArray = [{
		'fieldType': 'formControl',
		'layout': {
			'class': 'col-12',
			'style': {},
		},
		'context': {
			'key': 'hello',
			'type': '_uxTextInput',
			'inputs': {
				'label': 'Hello',
			},
		},
	} as UxDynFormModel];
	initialData: object = {
		hello: 'World',
	};

	dynForm: DynFormApi;
	private formSubs;

	public euiLoading: boolean;

	public mode: string;

	constructor(private formApiService: DynFormApiService) {
		this.dynForm = this.formApiService.createForm(this.metaData, this.initialData);
		this.formSubs = this.dynForm.isReady.subscribe((ready) => {
			if (ready) {
				// After It is ready, you can implement your run-time features
			}
		});
	}

	ngOnDestroy() {
		if (this.formSubs) {
			this.formSubs.unsubscribe();
		}
	}

	ngOnInit(): void {
	}
}
