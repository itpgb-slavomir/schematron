import { Component, OnInit } from '@angular/core';
import { SXFormComponent } from '../../form/form.component';

@Component({
	selector: 'sx-schema-index',
	templateUrl: './index.component.html',
	styleUrls: ['./index.component.scss']
})
export class SXSchemaIndexComponent extends SXFormComponent implements OnInit {

	ngOnInit(): void {
	}

}
