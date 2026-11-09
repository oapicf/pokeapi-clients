# WWW::OpenAPIClient::Object::LocationDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::LocationDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**region** | [**RegionSummary**](RegionSummary.md) | The region this location can be found in. | 
**names** | [**ARRAY[LocationName]**](LocationName.md) | The name of this resource listed in different languages. | [readonly] 
**game_indices** | [**ARRAY[LocationGameIndex]**](LocationGameIndex.md) | A list of game indices relevent to this location by generation. | [readonly] 
**areas** | [**ARRAY[LocationAreaSummary]**](LocationAreaSummary.md) | Areas that can be found within this location. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


