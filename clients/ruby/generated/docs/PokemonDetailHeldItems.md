# PokeApiClient::PokemonDetailHeldItems

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **item** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  |  |
| **version_details** | [**Array&lt;ItemDetailHeldByPokemonInnerVersionDetailsInner&gt;**](ItemDetailHeldByPokemonInnerVersionDetailsInner.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonDetailHeldItems.new(
  item: null,
  version_details: null
)
```

