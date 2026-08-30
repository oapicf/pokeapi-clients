# PokemonDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** |  | [readonly]
**name** | **String** |  | 
**base_experience** | Option<**i32**> |  | [optional]
**height** | Option<**i32**> |  | [optional]
**is_default** | Option<**bool**> |  | [optional]
**order** | Option<**i32**> |  | [optional]
**weight** | Option<**i32**> |  | [optional]
**abilities** | [**Vec<models::PokemonDetailAbilitiesInner>**](PokemonDetailAbilitiesInner.md) |  | [readonly]
**past_abilities** | [**Vec<models::PokemonDetailPastAbilitiesInner>**](PokemonDetailPastAbilitiesInner.md) |  | [readonly]
**forms** | [**Vec<models::PokemonFormSummary>**](PokemonFormSummary.md) |  | [readonly]
**game_indices** | [**Vec<models::PokemonGameIndex>**](PokemonGameIndex.md) |  | [readonly]
**held_items** | [**models::PokemonDetailHeldItems**](PokemonDetailHeldItems.md) |  | 
**location_area_encounters** | **String** |  | [readonly]
**moves** | [**Vec<models::PokemonDetailMovesInner>**](PokemonDetailMovesInner.md) |  | [readonly]
**species** | [**models::PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 
**sprites** | [**models::PokemonDetailSprites**](PokemonDetailSprites.md) |  | 
**cries** | [**models::PokemonDetailCries**](PokemonDetailCries.md) |  | 
**stats** | [**Vec<models::PokemonStat>**](PokemonStat.md) |  | [readonly]
**types** | [**Vec<models::PokemonDetailTypesInner>**](PokemonDetailTypesInner.md) |  | [readonly]
**past_types** | [**Vec<models::PokemonDetailPastTypesInner>**](PokemonDetailPastTypesInner.md) |  | [readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


