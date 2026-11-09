# PokeApiClient::PokemonHeldItemSummary

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **item** | [**ItemSummary**](ItemSummary.md) | The item the referenced Pokémon holds. |  |
| **version_details** | [**Array&lt;PokemonHeldItemVersion&gt;**](PokemonHeldItemVersion.md) | The details of the different versions in which the item is held. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonHeldItemSummary.new(
  item: null,
  version_details: null
)
```

