import { Component, OnInit } from '@angular/core';
import { UxDynFormModelArray } from '@eui/dynamic-forms';
import { SXFormComponent } from '../../form/form.component';
import SXFolderSearchCFormMetaData from './search.form';

@Component({
	selector: 'sx-folder-search',
	templateUrl: './search.component.html',
	styleUrls: ['./search.component.scss']
})
export class SXFolderSearchComponent extends SXFormComponent implements OnInit {

	public formMetaData: UxDynFormModelArray = SXFolderSearchCFormMetaData;

	ngOnInit(): void {
	}

}
