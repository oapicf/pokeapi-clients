# LocationDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly]
**name** | **String** | The name for this resource. | 
**region** | Option<[**models::RegionSummary**](RegionSummary.md)> | The region this location can be found in. | 
**names** | [**Vec<models::LocationName>**](LocationName.md) | The name of this resource listed in different languages. | [readonly]
**game_indices** | [**Vec<models::LocationGameIndex>**](LocationGameIndex.md) | A list of game indices relevent to this location by generation. | [readonly]
**areas** | [**Vec<models::LocationAreaSummary>**](LocationAreaSummary.md) | Areas that can be found within this location. | [readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


