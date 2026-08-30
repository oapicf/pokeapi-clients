# openapi::PokemonDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** |  | [readonly] 
**name** | **character** |  | [Max. length: 100] 
**base_experience** | **integer** |  | [optional] 
**height** | **integer** |  | [optional] 
**is_default** | **character** |  | [optional] 
**order** | **integer** |  | [optional] 
**weight** | **integer** |  | [optional] 
**abilities** | [**array[PokemonDetailAbilitiesInner]**](PokemonDetail_abilities_inner.md) |  | [readonly] 
**past_abilities** | [**array[PokemonDetailPastAbilitiesInner]**](PokemonDetail_past_abilities_inner.md) |  | [readonly] 
**forms** | [**array[PokemonFormSummary]**](PokemonFormSummary.md) |  | [readonly] 
**game_indices** | [**array[PokemonGameIndex]**](PokemonGameIndex.md) |  | [readonly] 
**held_items** | [**PokemonDetailHeldItems**](PokemonDetail_held_items.md) |  | 
**location_area_encounters** | **character** |  | [readonly] 
**moves** | [**array[PokemonDetailMovesInner]**](PokemonDetail_moves_inner.md) |  | [readonly] 
**species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 
**sprites** | [**PokemonDetailSprites**](PokemonDetail_sprites.md) |  | 
**cries** | [**PokemonDetailCries**](PokemonDetail_cries.md) |  | 
**stats** | [**array[PokemonStat]**](PokemonStat.md) |  | [readonly] 
**types** | [**array[PokemonDetailTypesInner]**](PokemonDetail_types_inner.md) |  | [readonly] 
**past_types** | [**array[PokemonDetailPastTypesInner]**](PokemonDetail_past_types_inner.md) |  | [readonly] 


