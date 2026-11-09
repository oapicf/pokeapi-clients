# openapi::GenderDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**pokemon_species_details** | [**array[GenderPokemonSpecies]**](GenderPokemonSpecies.md) | A list of Pokémon species that can be this gender and how likely it is that they will be. | [readonly] 
**required_for_evolution** | [**array[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) | A list of Pokémon species that required this gender in order for a Pokémon to evolve into them. | [readonly] 


