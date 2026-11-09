# version_group_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **char \*** | The name for this resource. | 
**order** | **int** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional] 
**generation** | [**generation_summary_t**](generation_summary.md) \* | The generation this version was introduced in. | 
**move_learn_methods** | [**list_t**](move_learn_method_summary.md) \* | A list of methods in which Pokémon can learn moves in this version group. | [readonly] 
**pokedexes** | [**list_t**](pokedex_summary.md) \* | A list of Pokédexes introduces in this version group. | [readonly] 
**regions** | [**list_t**](region_summary.md) \* | A list of regions that can be visited in this version group. | [readonly] 
**versions** | [**list_t**](version_summary.md) \* | The versions this version group owns. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


