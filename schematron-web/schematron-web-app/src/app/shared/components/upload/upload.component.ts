import { ChangeDetectorRef, Component, OnDestroy, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { EuiFileUploadUtilsService } from '@eui/components/eui-file-upload';
import { Subject, takeUntil } from 'rxjs';

@Component({
	selector: 'sx-upload',
	templateUrl: './upload.component.html',
	styleUrls: ['./upload.component.scss']
})
export class SXUploadComponent implements OnInit {

	public form: FormGroup;
	public progress = 0;
	private destroy$: Subject<boolean> = new Subject<boolean>();

	constructor(private cd: ChangeDetectorRef, private euiFileUploadUtilsService: EuiFileUploadUtilsService) { }

	ngOnInit(): void {
		this.form = new FormGroup({
			name: new FormControl('John Doe'),
			image: new FormControl(null, Validators.required),
		});

		this.form.get('image').valueChanges.pipe(takeUntil(this.destroy$)).subscribe(() => {
			this.progress = 0;
		});
	}

	ngOnDestroy(): void {
		this.destroy$.next(true);
		this.destroy$.unsubscribe();
	}

	public onSubmit(): void {
		console.log(this.form.value);
		if (this.form.valid) {
			this.euiFileUploadUtilsService.sendData(this.form.value, 'http://localhost:3000/api/fake-api').pipe(
				this.euiFileUploadUtilsService.uploadProgress((progress) => {
					if (this.form.get('image').value.length > 0) {
						this.progress = progress;
						this.cd.detectChanges();
					}
				}),
				this.euiFileUploadUtilsService.toResponseBody(),
			).subscribe((response) => {
				console.log(response);
			});
		}
	}
}
