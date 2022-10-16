import { Component, OnInit } from '@angular/core';
import { FolderService } from 'src/app/shared/api-client/api/folder.service';
import { DocumentList } from 'src/app/shared/api-client/model/documentList';


@Component({
	selector: 'sx-folder-browse',
	templateUrl: './browse.component.html',
	styleUrls: ['./browse.component.scss']
})
export class SXFolderBrowseComponent implements OnInit {

	public isBlocked: boolean = true;

	public mode: string = 'table';

	public euiLoading: boolean = false;

	public documentList: DocumentList = new DocumentList();

	constructor(private service: FolderService) { }

	ngOnInit(): void {
		this.load();
	}

	private load(): void {
		this.isBlocked = true;

		let promises = [];

		promises.push(this.service.getFolderList()
			.toPromise()
			.then((response: DocumentList) => {
				this.documentList = response;
				console.log(response);
			}));

		Promise.all(promises)

			.then((response) => {

			})

			.catch((error) => {
				console.log(error)
			})

			.finally(() => {
				this.isBlocked = false;
			});
	}

	onPageChange(event) {

	}

}
