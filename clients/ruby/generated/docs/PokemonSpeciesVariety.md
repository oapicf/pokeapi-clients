# PokeApiClient::PokemonSpeciesVariety

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **is_default** | **Boolean** | Whether this variety is the default variety. |  |
| **pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon variety. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonSpeciesVariety.new(
  is_default: null,
  pokemon: null
)
```

