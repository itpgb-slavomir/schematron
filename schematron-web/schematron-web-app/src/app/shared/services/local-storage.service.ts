import { Injectable } from '@angular/core';
import { Observable, BehaviorSubject, of, forkJoin, delay, ObservableInput, take } from 'rxjs';

@Injectable({
	providedIn: 'root'
})
export class LocalStorageService {

	private itemSources: Map<string, BehaviorSubject<object>> = new Map();

	protected get storage(): Storage {
		return sessionStorage;
	}

	constructor() {
		addEventListener('storage',
			(event: StorageEvent) => {
				if (event.key) {
					if (this.itemSources.has(event.key)) {
						this.itemSources.get(event.key).next(JSON.parse(event.newValue));
					}
				}
			}
		);
	}

	getItem(key: string, value?: object): Observable<Object> {
		if (!this.itemSources.has(key)) {
			this.setItem(key, value);
		}

		return this.itemSources.get(key).asObservable();
	}

	setItem(key: string, obj: object) {
		try {
			const value: string = JSON.stringify(obj);

			this.storage.setItem(key, value);

			if (!this.itemSources.has(key)) {
				this.itemSources.set(key, new BehaviorSubject<object>(obj));
			} else if (this.itemSources.has(key)) {
				this.itemSources.get(key).next(obj);
			}
		}
		catch (error) {
			this.itemSources.get(key).error(error);
		}
	}

	removeItem(key: string) {
		this.storage.removeItem(key);

		if (this.itemSources.has(key)) {
			this.itemSources.get(key).next(null);
			this.itemSources.delete(key);
		}
	}

	clear() {
		this.storage.clear();
		this.itemSources.forEach((itemSource: BehaviorSubject<object>) => {
			itemSource.next(null);
			itemSource.complete();
		});

		this.itemSources.clear();
	}
}
