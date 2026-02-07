# openapi::PokedexDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** |  | [readonly] 
**name** | **character** |  | [Max. length: 100] 
**is_main_series** | **character** |  | [optional] 
**descriptions** | [**array[PokedexDescription]**](PokedexDescription.md) |  | 
**names** | [**array[PokedexName]**](PokedexName.md) |  | 
**pokemon_entries** | [**array[PokedexDetailPokemonEntriesInner]**](PokedexDetail_pokemon_entries_inner.md) |  | 
**region** | [**RegionSummary**](RegionSummary.md) |  | 
**version_groups** | [**array[AbilityDetailPokemonInnerPokemon]**](AbilityDetail_pokemon_inner_pokemon.md) |  | 


