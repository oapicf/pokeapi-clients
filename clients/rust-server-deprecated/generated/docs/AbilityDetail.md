# AbilityDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**is_main_series** | **bool** | Whether or not this ability originated in the main series of the video games. | [optional] [default to None]
**generation** | [***models::GenerationSummary**](GenerationSummary.md) | The generation this ability originated in. | 
**names** | [**Vec<models::AbilityName>**](AbilityName.md) | The name of this resource listed in different languages. | [readonly] 
**effect_entries** | [**Vec<models::AbilityEffectText>**](AbilityEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**effect_changes** | [**Vec<models::AbilityChange>**](AbilityChange.md) | The list of previous effects this ability has had across version groups. | [readonly] 
**flavor_text_entries** | [**Vec<models::AbilityFlavorText>**](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**pokemon** | [**Vec<models::AbilityPokemonDetail>**](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


