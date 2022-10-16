import { UxDynFormModelArray, UxDynFormModel } from '@eui/dynamic-forms';

let SXEditFolderFormMetaData: UxDynFormModelArray = [
	{

		"fieldType": "formGroup",
		"layout": {
			"class": "col-6",
			"style": {}
		},

		"context": {
			"key": "folder",
			"type": "_uxFieldSetContainer",
			"inputs": {
				"label": "Folder"
			}
		},

		"children": [
			{
				"fieldType": "formControl",
				"layout": {
					"class": "col-12",
					"style": {}
				},

				"context": {
					"key": "propertyName",
					"type": "_uxSelectAutoCompleteInput",
					"inputs": {
						"label": "In",
						"placeHolder": "Select parent folder",
						"selectOptions": [
							{
								"id": "1",
								"label": "Root"
							},
							{
								"id": "2",
								"label": "/tmp"
							}
						]
					}
				}
			},
			{
				"fieldType": "formControl",
				"layout": { "class": "col-12", "style": {} },
				"context": {
					"key": "child2",
					"type": "_uxTextInput",
					"inputs": {
						"label": "Name",
						"placeHolder": ""
					}
				}
			},
		]
	},

	{

		"fieldType": "formGroup",
		"layout": {
			"class": "col-6",
			"style": {}
		},

		"context": {
			"key": "permission",
			"type": "_uxFieldSetContainer",
			"inputs": {
				"label": "Permission"
			}
		},

		"children": []
	},

	{
		"fieldType": "container",
		"layout": {
			"class": "col-12",
			"style": {}
		},

		"context": {
			"type": "_uxButton",
			"inputs": {
				"block": false,
				"disabled": false,
				"onClickExtraData": "asdasd",
				"flat": false,
				"label": "Save",
				"large": false,
				"outline": false,
				"secondary": false,
				"small": false,
				"typeClass": "info"
			}
		}
	}
];

export default SXEditFolderFormMetaData;