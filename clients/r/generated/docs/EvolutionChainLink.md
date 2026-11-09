# openapi::EvolutionChainLink


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_baby** | **character** | Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. | 
**species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species at this point in the evolution chain. | 
**evolution_details** | [**array[PokemonEvolution]**](PokemonEvolution.md) | All details regarding the specific details of the referenced Pokémon species evolution. | 
**evolves_to** | [**array[EvolutionChainLink]**](EvolutionChainLink.md) | A List of chain objects. | [readonly] 


