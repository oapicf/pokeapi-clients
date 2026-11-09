# pokedex_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **char \*** | The name for this resource. | 
**is_main_series** | **int** | Whether or not this Pokédex originated in the main series of the video games. | [optional] 
**descriptions** | [**list_t**](pokedex_description.md) \* | The description of this resource listed in different languages. | [readonly] 
**names** | [**list_t**](pokedex_name.md) \* | The name of this resource listed in different languages. | [readonly] 
**pokemon_entries** | [**list_t**](pokemon_dex_number.md) \* | A list of Pokémon catalogued in this Pokédex and their indexes. | [readonly] 
**region** | [**region_summary_t**](region_summary.md) \* | The region this Pokédex catalogues Pokémon for. | 
**version_groups** | [**list_t**](version_group_summary.md) \* | A list of version groups this Pokédex is relevant to. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


