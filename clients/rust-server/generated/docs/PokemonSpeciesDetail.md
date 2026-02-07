# PokemonSpeciesDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** |  | [readonly] 
**name** | **String** |  | 
**order** | **i32** |  | [optional] [default to None]
**gender_rate** | **i32** |  | [optional] [default to None]
**capture_rate** | **i32** |  | [optional] [default to None]
**base_happiness** | **i32** |  | [optional] [default to None]
**is_baby** | **bool** |  | [optional] [default to None]
**is_legendary** | **bool** |  | [optional] [default to None]
**is_mythical** | **bool** |  | [optional] [default to None]
**hatch_counter** | **i32** |  | [optional] [default to None]
**has_gender_differences** | **bool** |  | [optional] [default to None]
**forms_switchable** | **bool** |  | [optional] [default to None]
**growth_rate** | [***models::GrowthRateSummary**](GrowthRateSummary.md) |  | 
**pokedex_numbers** | [**Vec<models::PokemonDexEntry>**](PokemonDexEntry.md) |  | 
**egg_groups** | [**Vec<models::AbilityDetailPokemonInnerPokemon>**](AbilityDetail_pokemon_inner_pokemon.md) |  | 
**color** | [***models::PokemonColorSummary**](PokemonColorSummary.md) |  | 
**shape** | [***models::PokemonShapeSummary**](PokemonShapeSummary.md) |  | 
**evolves_from_species** | [***models::PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 
**evolution_chain** | [***models::EvolutionChainSummary**](EvolutionChainSummary.md) |  | 
**habitat** | [***models::PokemonHabitatSummary**](PokemonHabitatSummary.md) |  | 
**generation** | [***models::GenerationSummary**](GenerationSummary.md) |  | 
**names** | [**Vec<models::PokemonFormDetailFormNamesInner>**](PokemonFormDetail_form_names_inner.md) |  | 
**pal_park_encounters** | [**Vec<models::PokemonSpeciesDetailPalParkEncountersInner>**](PokemonSpeciesDetail_pal_park_encounters_inner.md) |  | 
**form_descriptions** | [**Vec<models::PokemonSpeciesDescription>**](PokemonSpeciesDescription.md) |  | 
**flavor_text_entries** | [**Vec<models::PokemonSpeciesFlavorText>**](PokemonSpeciesFlavorText.md) |  | 
**genera** | [**Vec<models::PokemonSpeciesDetailGeneraInner>**](PokemonSpeciesDetail_genera_inner.md) |  | 
**varieties** | [**Vec<models::PokemonSpeciesDetailVarietiesInner>**](PokemonSpeciesDetail_varieties_inner.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


