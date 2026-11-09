# ability_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **char \*** | The name for this resource. | 
**is_main_series** | **int** | Whether or not this ability originated in the main series of the video games. | [optional] 
**generation** | [**generation_summary_t**](generation_summary.md) \* | The generation this ability originated in. | 
**names** | [**list_t**](ability_name.md) \* | The name of this resource listed in different languages. | [readonly] 
**effect_entries** | [**list_t**](ability_effect_text.md) \* | The effect of this ability listed in different languages. | [readonly] 
**effect_changes** | [**list_t**](ability_change.md) \* | The list of previous effects this ability has had across version groups. | [readonly] 
**flavor_text_entries** | [**list_t**](ability_flavor_text.md) \* | The flavor text of this ability listed in different languages. | [readonly] 
**pokemon** | [**list_t**](ability_pokemon_detail.md) \* | A list of Pokémon that could potentially have this ability. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


