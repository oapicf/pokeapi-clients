# openapi::PokedexDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** |  | [readonly] 
**name** | **character** |  | [Max. length: 100] 
**is_main_series** | **character** |  | [optional] 
**descriptions** | [**array[PokedexDescription]**](PokedexDescription.md) |  | [readonly] 
**names** | [**array[PokedexName]**](PokedexName.md) |  | [readonly] 
**pokemon_entries** | [**array[PokedexDetailPokemonEntriesInner]**](PokedexDetail_pokemon_entries_inner.md) |  | [readonly] 
**region** | [**RegionSummary**](RegionSummary.md) |  | 
**version_groups** | [**array[AbilityDetailPokemonInnerPokemon]**](AbilityDetail_pokemon_inner_pokemon.md) |  | [readonly] 


