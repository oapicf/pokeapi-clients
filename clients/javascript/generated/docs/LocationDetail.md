# PokeapiClient.LocationDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**region** | [**RegionSummary**](RegionSummary.md) | The region this location can be found in. | 
**names** | [**[LocationName]**](LocationName.md) | The name of this resource listed in different languages. | [readonly] 
**gameIndices** | [**[LocationGameIndex]**](LocationGameIndex.md) | A list of game indices relevent to this location by generation. | [readonly] 
**areas** | [**[LocationAreaSummary]**](LocationAreaSummary.md) | Areas that can be found within this location. | [readonly] 


