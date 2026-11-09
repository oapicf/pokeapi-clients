# region_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **char \*** | The name for this resource. | 
**locations** | [**list_t**](location_summary.md) \* | A list of locations that can be found in this region. | [readonly] 
**main_generation** | [**generation_summary_t**](generation_summary.md) \* | The generation this region was introduced in. | [readonly] 
**names** | [**list_t**](region_name.md) \* | The name of this resource listed in different languages. | [readonly] 
**pokedexes** | [**list_t**](pokedex_summary.md) \* | A list of pokédexes that catalogue Pokémon in this region. | [readonly] 
**version_groups** | [**list_t**](version_group_summary.md) \* | A list of version groups where this region can be visited. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


