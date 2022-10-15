import { Component, OnInit } from '@angular/core';
import { DocumentList } from 'src/app/shared/api-client/model/documentList';


@Component({
	selector: 'sx-folder-browse',
	templateUrl: './browse.component.html',
	styleUrls: ['./browse.component.scss']
})
export class SXFolderBrowseComponent implements OnInit {

	public mode: string = 'table';

	public documentList: DocumentList = new DocumentList();

	constructor() { }

	ngOnInit(): void {
		this.load();
	}

	private load(): void {

	}

}
