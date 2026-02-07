# PokemonSpeciesDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** |  | [readonly]
**name** | **String** |  | 
**order** | Option<**i32**> |  | [optional]
**gender_rate** | Option<**i32**> |  | [optional]
**capture_rate** | Option<**i32**> |  | [optional]
**base_happiness** | Option<**i32**> |  | [optional]
**is_baby** | Option<**bool**> |  | [optional]
**is_legendary** | Option<**bool**> |  | [optional]
**is_mythical** | Option<**bool**> |  | [optional]
**hatch_counter** | Option<**i32**> |  | [optional]
**has_gender_differences** | Option<**bool**> |  | [optional]
**forms_switchable** | Option<**bool**> |  | [optional]
**growth_rate** | [**models::GrowthRateSummary**](GrowthRateSummary.md) |  | 
**pokedex_numbers** | [**Vec<models::PokemonDexEntry>**](PokemonDexEntry.md) |  | 
**egg_groups** | [**Vec<models::AbilityDetailPokemonInnerPokemon>**](AbilityDetail_pokemon_inner_pokemon.md) |  | 
**color** | [**models::PokemonColorSummary**](PokemonColorSummary.md) |  | 
**shape** | [**models::PokemonShapeSummary**](PokemonShapeSummary.md) |  | 
**evolves_from_species** | [**models::PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 
**evolution_chain** | [**models::EvolutionChainSummary**](EvolutionChainSummary.md) |  | 
**habitat** | [**models::PokemonHabitatSummary**](PokemonHabitatSummary.md) |  | 
**generation** | [**models::GenerationSummary**](GenerationSummary.md) |  | 
**names** | [**Vec<models::PokemonFormDetailFormNamesInner>**](PokemonFormDetail_form_names_inner.md) |  | 
**pal_park_encounters** | [**Vec<models::PokemonSpeciesDetailPalParkEncountersInner>**](PokemonSpeciesDetail_pal_park_encounters_inner.md) |  | 
**form_descriptions** | [**Vec<models::PokemonSpeciesDescription>**](PokemonSpeciesDescription.md) |  | 
**flavor_text_entries** | [**Vec<models::PokemonSpeciesFlavorText>**](PokemonSpeciesFlavorText.md) |  | 
**genera** | [**Vec<models::PokemonSpeciesDetailGeneraInner>**](PokemonSpeciesDetail_genera_inner.md) |  | 
**varieties** | [**Vec<models::PokemonSpeciesDetailVarietiesInner>**](PokemonSpeciesDetail_varieties_inner.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


