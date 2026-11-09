# PokeApiClient::TypePokemon

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **slot** | **Integer** | The order the Pokémon&#39;s types are listed in. |  |
| **pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that has the referenced type. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::TypePokemon.new(
  slot: null,
  pokemon: null
)
```

