# GENDER_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**pokemon_species_details** | [**LIST [GENDER_POKEMON_SPECIES]**](GenderPokemonSpecies.md) | A list of Pokémon species that can be this gender and how likely it is that they will be. | [readonly] [default to null]
**required_for_evolution** | [**LIST [POKEMON_SPECIES_SUMMARY]**](PokemonSpeciesSummary.md) | A list of Pokémon species that required this gender in order for a Pokémon to evolve into them. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


