# PokemonDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** |  | [readonly] 
**name** | **String** |  | 
**base_experience** | **i32** |  | [optional] [default to None]
**height** | **i32** |  | [optional] [default to None]
**is_default** | **bool** |  | [optional] [default to None]
**order** | **i32** |  | [optional] [default to None]
**weight** | **i32** |  | [optional] [default to None]
**abilities** | [**Vec<models::PokemonDetailAbilitiesInner>**](PokemonDetail_abilities_inner.md) |  | [readonly] 
**past_abilities** | [**Vec<models::PokemonDetailPastAbilitiesInner>**](PokemonDetail_past_abilities_inner.md) |  | [readonly] 
**forms** | [**Vec<models::PokemonFormSummary>**](PokemonFormSummary.md) |  | [readonly] 
**game_indices** | [**Vec<models::PokemonGameIndex>**](PokemonGameIndex.md) |  | [readonly] 
**held_items** | [***models::PokemonDetailHeldItems**](PokemonDetail_held_items.md) |  | 
**location_area_encounters** | **String** |  | [readonly] 
**moves** | [**Vec<models::PokemonDetailMovesInner>**](PokemonDetail_moves_inner.md) |  | [readonly] 
**species** | [***models::PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 
**sprites** | [***models::PokemonDetailSprites**](PokemonDetail_sprites.md) |  | 
**cries** | [***models::PokemonDetailCries**](PokemonDetail_cries.md) |  | 
**stats** | [**Vec<models::PokemonStat>**](PokemonStat.md) |  | [readonly] 
**types** | [**Vec<models::PokemonDetailTypesInner>**](PokemonDetail_types_inner.md) |  | [readonly] 
**past_types** | [**Vec<models::PokemonDetailPastTypesInner>**](PokemonDetail_past_types_inner.md) |  | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


