# GenderDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**pokemon_species_details** | [**Vec<models::GenderPokemonSpecies>**](GenderPokemonSpecies.md) | A list of Pokémon species that can be this gender and how likely it is that they will be. | [readonly] 
**required_for_evolution** | [**Vec<models::PokemonSpeciesSummary>**](PokemonSpeciesSummary.md) | A list of Pokémon species that required this gender in order for a Pokémon to evolve into them. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


