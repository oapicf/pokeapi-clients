# openapi::BerryFlavorDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**berries** | [**array[BerryFlavorBerryMap]**](BerryFlavorBerryMap.md) | A list of the berries with this flavor. | [readonly] 
**contest_type** | [**ContestTypeSummary**](ContestTypeSummary.md) | The contest type that correlates with this berry flavor. | 
**names** | [**array[BerryFlavorName]**](BerryFlavorName.md) | The name of this resource listed in different languages. | [readonly] 


