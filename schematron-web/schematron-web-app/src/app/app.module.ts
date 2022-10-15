import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { APP_INITIALIZER, NgModule } from '@angular/core';
import { CoreModule } from './core/core.module';
import { SharedModule } from './shared/shared.module';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AppStarterService } from './app-starter.service';
import { DashboardComponent } from './features/dashboard/dashboard.component';

@NgModule({
	declarations: [
		AppComponent,
		DashboardComponent,
	],
	imports: [
		BrowserModule,
		BrowserAnimationsModule,
		CoreModule,
		SharedModule,
		AppRoutingModule,
	],

	providers: [
		AppStarterService,
		{
			provide: APP_INITIALIZER,
			useFactory: (appStarterService) => () => new Promise<void>((resolve) => {
				appStarterService.start().subscribe(() => resolve());
			}),
			deps: [AppStarterService],
			multi: true
		},
	],
	bootstrap: [
		AppComponent,
	],
})
export class AppModule { }
