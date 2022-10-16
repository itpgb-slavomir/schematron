import { UxDynFormModelArray, UxDynFormModel } from '@eui/dynamic-forms';

let SXEditSchemaFormMetaData: UxDynFormModelArray = [
	{
		"fieldType": "formGroup",
		"layout": { "class": "col-12", "style": {} },
		"context": {
			"key": "groupName",
			"type": "_uxTabGroupContainer",
			"inputs": {
				"tabs": [
					"Design",
					"Schema",
					"EUI",
					"XSD",
					"JSON",
					"OpenAPI"
				]
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
					"key": "child2",
					"type": "_uxTextInput",
					"inputs": {
						"label": "Surname",
						"placeHolder": "Doe"
					}
				}
			},

			{
				"fieldType": "formControl",
				"layout": {
					"class": "col-12",
					"style": {}
				},

				"context": {
					"key": "targetNamespace",
					"type": "_uxSelectAutoCompleteInput",
					"inputs": {
						"label": "Target namespace",
						"placeHolder": "http://www.omg.org/spec/BPMN/20100524/DI",
						"selectOptions": [
							{
								"id": "1",
								"label": "http://www.w3.org/XML/1998/namespace"
							},
							{
								"id": "2",
								"label": "http://www.w3.org/2001/XMLSchema"
							}
						]
					},
				},

				"children": [

				],
			},

			{
				"fieldType": "formControl",

				"layout": {
					"class": "col-12",
					"style": {}
				},

				"context": {
					"key": "source",
					"type": "_uxTextAreaInput",
					"inputs": {
						"label": "Source",
						"placeHolder": "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
					}
				}
			}
		]
	}
];

export default SXEditSchemaFormMetaData;