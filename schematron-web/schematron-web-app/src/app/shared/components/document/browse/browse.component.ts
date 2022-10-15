import { Component, OnInit } from '@angular/core';
import { DocumentService } from 'src/app/shared/api-client/api/document.service';
import { DocumentList } from 'src/app/shared/api-client/model/documentList';

@Component({
	selector: 'sx-document-browse',
	templateUrl: './browse.component.html',
	styleUrls: ['./browse.component.scss']
})
export class SXDocumentBrowseComponent implements OnInit {

	public documentList: DocumentList;

	constructor(private documentService: DocumentService) { }

	ngOnInit(): void {
		this.documentService.getDocumentList().subscribe((documentList) => {
			this.documentList = documentList;
		}, (error) => { });
	}

	public onSidebarItemClicked(event): void { }


}
