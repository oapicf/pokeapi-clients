# LOCATION_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**region** | [**REGION_SUMMARY**](RegionSummary.md) | The region this location can be found in. | [default to null]
**names** | [**LIST [LOCATION_NAME]**](LocationName.md) | The name of this resource listed in different languages. | [readonly] [default to null]
**game_indices** | [**LIST [LOCATION_GAME_INDEX]**](LocationGameIndex.md) | A list of game indices relevent to this location by generation. | [readonly] [default to null]
**areas** | [**LIST [LOCATION_AREA_SUMMARY]**](LocationAreaSummary.md) | Areas that can be found within this location. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


