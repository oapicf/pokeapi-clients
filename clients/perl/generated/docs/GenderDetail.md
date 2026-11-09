# WWW::OpenAPIClient::Object::GenderDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GenderDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**pokemon_species_details** | [**ARRAY[GenderPokemonSpecies]**](GenderPokemonSpecies.md) | A list of Pokémon species that can be this gender and how likely it is that they will be. | [readonly] 
**required_for_evolution** | [**ARRAY[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) | A list of Pokémon species that required this gender in order for a Pokémon to evolve into them. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


