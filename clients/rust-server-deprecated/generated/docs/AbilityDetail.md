# AbilityDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** |  | [readonly] 
**name** | **String** |  | 
**is_main_series** | **bool** |  | [optional] [default to None]
**generation** | [***models::GenerationSummary**](GenerationSummary.md) |  | 
**names** | [**Vec<models::AbilityName>**](AbilityName.md) |  | [readonly] 
**effect_entries** | [**Vec<models::AbilityEffectText>**](AbilityEffectText.md) |  | [readonly] 
**effect_changes** | [**Vec<models::AbilityChange>**](AbilityChange.md) |  | [readonly] 
**flavor_text_entries** | [**Vec<models::AbilityFlavorText>**](AbilityFlavorText.md) |  | [readonly] 
**pokemon** | [**Vec<models::AbilityDetailPokemonInner>**](AbilityDetail_pokemon_inner.md) |  | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


