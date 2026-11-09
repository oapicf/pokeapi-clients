# LocationDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`region`** | [**`*RegionSummary`**](RegionSummary.md) | The region this location can be found in. | [default to nothing]
**`names`** | [**`Vector{LocationName}`**](LocationName.md) | The name of this resource listed in different languages. | [readonly] [default to nothing]
**`game_indices`** | [**`Vector{LocationGameIndex}`**](LocationGameIndex.md) | A list of game indices relevent to this location by generation. | [readonly] [default to nothing]
**`areas`** | [**`Vector{LocationAreaSummary}`**](LocationAreaSummary.md) | Areas that can be found within this location. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


