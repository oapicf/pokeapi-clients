# TypeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** |  | [readonly] 
**name** | **String** |  | 
**damage_relations** | [***models::TypeDetailDamageRelations**](TypeDetail_damage_relations.md) |  | 
**past_damage_relations** | [**Vec<models::TypeDetailPastDamageRelationsInner>**](TypeDetail_past_damage_relations_inner.md) |  | [readonly] 
**game_indices** | [**Vec<models::TypeGameIndex>**](TypeGameIndex.md) |  | [readonly] 
**generation** | [***models::GenerationSummary**](GenerationSummary.md) |  | 
**move_damage_class** | [***models::MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**names** | [**Vec<models::AbilityName>**](AbilityName.md) |  | [readonly] 
**pokemon** | [**Vec<models::TypeDetailPokemonInner>**](TypeDetail_pokemon_inner.md) |  | [readonly] 
**moves** | [**Vec<models::MoveSummary>**](MoveSummary.md) |  | [readonly] 
**sprites** | [**std::collections::HashMap<String, std::collections::HashMap<String, models::TypeDetailSpritesValueValue>>**](map.md) |  | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


