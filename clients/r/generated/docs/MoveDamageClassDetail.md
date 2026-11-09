# openapi::MoveDamageClassDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**descriptions** | [**array[MoveDamageClassDescription]**](MoveDamageClassDescription.md) | The description of this resource listed in different languages. | [readonly] 
**moves** | [**array[MoveSummary]**](MoveSummary.md) | A list of moves that fall into this damage class. | [readonly] 
**names** | [**array[MoveDamageClassName]**](MoveDamageClassName.md) | The name of this resource listed in different languages. | [readonly] 


