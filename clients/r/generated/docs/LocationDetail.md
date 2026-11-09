# openapi::LocationDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**region** | [**RegionSummary**](RegionSummary.md) | The region this location can be found in. | 
**names** | [**array[LocationName]**](LocationName.md) | The name of this resource listed in different languages. | [readonly] 
**game_indices** | [**array[LocationGameIndex]**](LocationGameIndex.md) | A list of game indices relevent to this location by generation. | [readonly] 
**areas** | [**array[LocationAreaSummary]**](LocationAreaSummary.md) | Areas that can be found within this location. | [readonly] 


