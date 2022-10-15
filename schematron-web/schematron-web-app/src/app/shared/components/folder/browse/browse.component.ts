import { Component, OnInit } from '@angular/core';
import { FolderService } from 'src/app/shared/api-client/api/folder.service';
import { DocumentList } from 'src/app/shared/api-client/model/documentList';


@Component({
	selector: 'sx-folder-browse',
	templateUrl: './browse.component.html',
	styleUrls: ['./browse.component.scss']
})
export class SXFolderBrowseComponent implements OnInit {

	public mode: string = 'table';

	public documentList: DocumentList = new DocumentList();

	constructor(private service: FolderService) { }

	ngOnInit(): void {
		this.load();
	}

	private load(): void {
		let promises = [];

		promises.push(this.service.getFolderList().toPromise().then((response) => {
			this.documentList = response;
		}));

		Promise.all(promises).then((response) => { }).catch((error) => console.log(error));
	}

}
