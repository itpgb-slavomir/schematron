import { Component, OnInit, Input } from '@angular/core';

@Component({
	selector: 'sx-header',
	templateUrl: './header.component.html',
	styleUrls: ['./header.component.scss']
})
export class SXHeaderComponent implements OnInit {

	@Input()
	public title: string = '';

	@Input()
	public subtitle: string = '';

	@Input()
	public meuItems: Array<object> = [];

	constructor() { }

	ngOnInit(): void {
	}

}
