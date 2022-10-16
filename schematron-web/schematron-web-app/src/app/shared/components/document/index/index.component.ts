import { Component, OnInit } from '@angular/core';
import { SXFormComponent } from '../../form/form.component';

@Component({
	selector: 'xs-document-index',
	templateUrl: './index.component.html',
	styleUrls: ['./index.component.scss']
})
export class SXDocumentIndexComponent extends SXFormComponent implements OnInit {

	ngOnInit(): void {
	}

}
