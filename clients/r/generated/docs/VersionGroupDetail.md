# openapi::VersionGroupDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** |  | [readonly] 
**name** | **character** |  | [Max. length: 100] 
**order** | **integer** |  | [optional] 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**move_learn_methods** | [**array[AbilityDetailPokemonInnerPokemon]**](AbilityDetail_pokemon_inner_pokemon.md) |  | [readonly] 
**pokedexes** | [**array[AbilityDetailPokemonInnerPokemon]**](AbilityDetail_pokemon_inner_pokemon.md) |  | [readonly] 
**regions** | [**array[AbilityDetailPokemonInnerPokemon]**](AbilityDetail_pokemon_inner_pokemon.md) |  | [readonly] 
**versions** | [**array[VersionSummary]**](VersionSummary.md) |  | [readonly] 


