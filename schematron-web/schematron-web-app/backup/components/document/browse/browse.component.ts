import { Component, OnInit } from '@angular/core';
import { DocumentList, DocumentService } from 'src/app/shared/schematron-client';
import { SharedModule } from './../../../shared.module';

@Component({
	selector: 'app-browse',
	templateUrl: './browse.component.html',
	styleUrls: ['./browse.component.scss']
})
export class BrowseComponent implements OnInit {

	public documentList: DocumentList;

	constructor(private documentService: DocumentService) { }

	ngOnInit(): void {
		this.documentService.getDocumentList().subscribe((documentList) => {
			this.documentList = documentList;
		}, (error) => { });
	}

	public onSidebarItemClicked(event): void { }


}
