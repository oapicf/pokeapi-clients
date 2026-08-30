# openapi::PokemonSpeciesDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** |  | [readonly] 
**name** | **character** |  | [Max. length: 100] 
**order** | **integer** |  | [optional] 
**gender_rate** | **integer** |  | [optional] 
**capture_rate** | **integer** |  | [optional] 
**base_happiness** | **integer** |  | [optional] 
**is_baby** | **character** |  | [optional] 
**is_legendary** | **character** |  | [optional] 
**is_mythical** | **character** |  | [optional] 
**hatch_counter** | **integer** |  | [optional] 
**has_gender_differences** | **character** |  | [optional] 
**forms_switchable** | **character** |  | [optional] 
**growth_rate** | [**GrowthRateSummary**](GrowthRateSummary.md) |  | 
**pokedex_numbers** | [**array[PokemonDexEntry]**](PokemonDexEntry.md) |  | [readonly] 
**egg_groups** | [**array[AbilityDetailPokemonInnerPokemon]**](AbilityDetail_pokemon_inner_pokemon.md) |  | [readonly] 
**color** | [**PokemonColorSummary**](PokemonColorSummary.md) |  | 
**shape** | [**PokemonShapeSummary**](PokemonShapeSummary.md) |  | 
**evolves_from_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 
**evolution_chain** | [**EvolutionChainSummary**](EvolutionChainSummary.md) |  | 
**habitat** | [**PokemonHabitatSummary**](PokemonHabitatSummary.md) |  | 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**names** | [**array[PokemonFormDetailFormNamesInner]**](PokemonFormDetail_form_names_inner.md) |  | [readonly] 
**pal_park_encounters** | [**array[PokemonSpeciesDetailPalParkEncountersInner]**](PokemonSpeciesDetail_pal_park_encounters_inner.md) |  | [readonly] 
**form_descriptions** | [**array[PokemonSpeciesDescription]**](PokemonSpeciesDescription.md) |  | [readonly] 
**flavor_text_entries** | [**array[PokemonSpeciesFlavorText]**](PokemonSpeciesFlavorText.md) |  | [readonly] 
**genera** | [**array[PokemonSpeciesDetailGeneraInner]**](PokemonSpeciesDetail_genera_inner.md) |  | [readonly] 
**varieties** | [**array[PokemonSpeciesDetailVarietiesInner]**](PokemonSpeciesDetail_varieties_inner.md) |  | [readonly] 


