# LocationDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly]
**name** | **string** | The name for this resource. |
**region** | [**\OpenAPI\Client\Model\RegionSummary**](RegionSummary.md) | The region this location can be found in. |
**names** | [**\OpenAPI\Client\Model\LocationName[]**](LocationName.md) | The name of this resource listed in different languages. | [readonly]
**game_indices** | [**\OpenAPI\Client\Model\LocationGameIndex[]**](LocationGameIndex.md) | A list of game indices relevent to this location by generation. | [readonly]
**areas** | [**\OpenAPI\Client\Model\LocationAreaSummary[]**](LocationAreaSummary.md) | Areas that can be found within this location. | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
