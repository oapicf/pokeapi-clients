# PokeApiClient::EvolutionChainLink

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **is_baby** | **Boolean** | Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. |  |
| **species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species at this point in the evolution chain. |  |
| **evolution_details** | [**Array&lt;PokemonEvolution&gt;**](PokemonEvolution.md) | All details regarding the specific details of the referenced Pokémon species evolution. |  |
| **evolves_to** | [**Array&lt;EvolutionChainLink&gt;**](EvolutionChainLink.md) | A List of chain objects. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::EvolutionChainLink.new(
  is_baby: null,
  species: null,
  evolution_details: null,
  evolves_to: null
)
```

