import { UxDynFormModelArray, UxDynFormModel } from '@eui/dynamic-forms';

let SXEditDocumentFormMetaData: UxDynFormModelArray = [
	{
		"fieldType": "container",
		"layout": {
			"class": "col-12 eui-u-ph-none",
			"style": {}
		},

		"context": {
			"type": "_uxBcRoot", "inputs": {}
		},

		"children": [
			{
				"fieldType": "formControl",

				"layout":
				{
					"class": "col-12",
					"style": {}
				},

				"context": {
					"key": "name",
					"type": "_uxTextInput",
					"inputs": {
						"label": "Name",
						"placeHolder": "New Document.xml"
					}
				}
			},

			{
				"fieldType": "container",
				"fieldId": "12345",
				"layout": {
					"class": "col-4", "style": {}
				},
				"context": {
					"type": "_uxButton",
					"inputs": {
						"secondary": true,
						"eventType": { "onClickExtraData": null },
						"label": "Button"
					}
				}, "children": []
			},

			{
				"fieldType": "container",
				"layout": { "class": "col-4", "style": {} },
				"context": {
					"type": "_uxButton", "inputs": {
						"secondary": true, "label": "Reset",
						"eventType": { "resetFormExtraData": null }
					}
				}, "children": []
			},

			{
				"fieldType": "container",
				"layout": { "class": "col-4", "style": {} },
				"context": {
					"type": "_uxButton",
					"inputs": {
						"label": "Submit",
						"onSubmit": {
							"actionMethod": "PUT",
							"actionUrl": "http://localhost:8080/api/asdasdasd/",
						},
						"eventType": { "submitFormExtraData": null }
					}
				},
				"children": []
			}]
	}]

export default SXEditDocumentFormMetaData;