# location_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **char \*** | The name for this resource. | 
**region** | [**region_summary_t**](region_summary.md) \* | The region this location can be found in. | 
**names** | [**list_t**](location_name.md) \* | The name of this resource listed in different languages. | [readonly] 
**game_indices** | [**list_t**](location_game_index.md) \* | A list of game indices relevent to this location by generation. | [readonly] 
**areas** | [**list_t**](location_area_summary.md) \* | Areas that can be found within this location. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


