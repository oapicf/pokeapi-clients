# PokeApiClient::PokemonHeldItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that holds this item. |  |
| **version_details** | [**Array&lt;PokemonHeldItemVersion&gt;**](PokemonHeldItemVersion.md) | The details for the version that this item is held in by the Pokémon. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonHeldItem.new(
  pokemon: null,
  version_details: null
)
```

