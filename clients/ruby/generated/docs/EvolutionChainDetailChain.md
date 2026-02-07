# PokeApiClient::EvolutionChainDetailChain

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **evolution_details** | **Array&lt;Object&gt;** |  |  |
| **evolves_to** | [**Array&lt;EvolutionChainDetailChainEvolvesToInner&gt;**](EvolutionChainDetailChainEvolvesToInner.md) |  |  |
| **is_baby** | **Boolean** |  |  |
| **species** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::EvolutionChainDetailChain.new(
  evolution_details: null,
  evolves_to: null,
  is_baby: null,
  species: null
)
```

