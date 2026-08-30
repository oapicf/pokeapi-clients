# WWW::OpenAPIClient::Object::PokemonDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::PokemonDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **string** |  | 
**base_experience** | **int** |  | [optional] 
**height** | **int** |  | [optional] 
**is_default** | **boolean** |  | [optional] 
**order** | **int** |  | [optional] 
**weight** | **int** |  | [optional] 
**abilities** | [**ARRAY[PokemonDetailAbilitiesInner]**](PokemonDetailAbilitiesInner.md) |  | [readonly] 
**past_abilities** | [**ARRAY[PokemonDetailPastAbilitiesInner]**](PokemonDetailPastAbilitiesInner.md) |  | [readonly] 
**forms** | [**ARRAY[PokemonFormSummary]**](PokemonFormSummary.md) |  | [readonly] 
**game_indices** | [**ARRAY[PokemonGameIndex]**](PokemonGameIndex.md) |  | [readonly] 
**held_items** | [**PokemonDetailHeldItems**](PokemonDetailHeldItems.md) |  | 
**location_area_encounters** | **string** |  | [readonly] 
**moves** | [**ARRAY[PokemonDetailMovesInner]**](PokemonDetailMovesInner.md) |  | [readonly] 
**species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 
**sprites** | [**PokemonDetailSprites**](PokemonDetailSprites.md) |  | 
**cries** | [**PokemonDetailCries**](PokemonDetailCries.md) |  | 
**stats** | [**ARRAY[PokemonStat]**](PokemonStat.md) |  | [readonly] 
**types** | [**ARRAY[PokemonDetailTypesInner]**](PokemonDetailTypesInner.md) |  | [readonly] 
**past_types** | [**ARRAY[PokemonDetailPastTypesInner]**](PokemonDetailPastTypesInner.md) |  | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


