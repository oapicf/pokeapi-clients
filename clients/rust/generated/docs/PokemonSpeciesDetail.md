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
**pokedex_numbers** | [**Vec<models::PokemonDexEntry>**](PokemonDexEntry.md) |  | [readonly]
**egg_groups** | [**Vec<models::AbilityDetailPokemonInnerPokemon>**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly]
**color** | [**models::PokemonColorSummary**](PokemonColorSummary.md) |  | 
**shape** | [**models::PokemonShapeSummary**](PokemonShapeSummary.md) |  | 
**evolves_from_species** | [**models::PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 
**evolution_chain** | [**models::EvolutionChainSummary**](EvolutionChainSummary.md) |  | 
**habitat** | [**models::PokemonHabitatSummary**](PokemonHabitatSummary.md) |  | 
**generation** | [**models::GenerationSummary**](GenerationSummary.md) |  | 
**names** | [**Vec<models::PokemonFormDetailFormNamesInner>**](PokemonFormDetailFormNamesInner.md) |  | [readonly]
**pal_park_encounters** | [**Vec<models::PokemonSpeciesDetailPalParkEncountersInner>**](PokemonSpeciesDetailPalParkEncountersInner.md) |  | [readonly]
**form_descriptions** | [**Vec<models::PokemonSpeciesDescription>**](PokemonSpeciesDescription.md) |  | [readonly]
**flavor_text_entries** | [**Vec<models::PokemonSpeciesFlavorText>**](PokemonSpeciesFlavorText.md) |  | [readonly]
**genera** | [**Vec<models::PokemonSpeciesDetailGeneraInner>**](PokemonSpeciesDetailGeneraInner.md) |  | [readonly]
**varieties** | [**Vec<models::PokemonSpeciesDetailVarietiesInner>**](PokemonSpeciesDetailVarietiesInner.md) |  | [readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


