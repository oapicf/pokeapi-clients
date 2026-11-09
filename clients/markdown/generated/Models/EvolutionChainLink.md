# EvolutionChainLink
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **is\_baby** | **Boolean** | Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. | [default to null] |
| **species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species at this point in the evolution chain. | [default to null] |
| **evolution\_details** | [**List**](PokemonEvolution.md) | All details regarding the specific details of the referenced Pokémon species evolution. | [default to null] |
| **evolves\_to** | [**List**](EvolutionChainLink.md) | A List of chain objects. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

