# EvolutionChainLink

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_baby** | **bool** | Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. | 
**species** | [**models::PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species at this point in the evolution chain. | 
**evolution_details** | [**Vec<models::PokemonEvolution>**](PokemonEvolution.md) | All details regarding the specific details of the referenced Pokémon species evolution. | 
**evolves_to** | [**Vec<models::EvolutionChainLink>**](EvolutionChainLink.md) | A List of chain objects. | [readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


