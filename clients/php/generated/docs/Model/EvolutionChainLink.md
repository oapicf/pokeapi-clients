# EvolutionChainLink

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_baby** | **bool** | Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. |
**species** | [**\OpenAPI\Client\Model\PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species at this point in the evolution chain. |
**evolution_details** | [**\OpenAPI\Client\Model\PokemonEvolution[]**](PokemonEvolution.md) | All details regarding the specific details of the referenced Pokémon species evolution. |
**evolves_to** | [**\OpenAPI\Client\Model\EvolutionChainLink[]**](EvolutionChainLink.md) | A List of chain objects. | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
