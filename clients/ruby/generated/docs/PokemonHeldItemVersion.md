# PokeApiClient::PokemonHeldItemVersion

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **rarity** | **Integer** | How often the item is held. |  |
| **version** | [**VersionSummary**](VersionSummary.md) | The version in which the item is held. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonHeldItemVersion.new(
  rarity: null,
  version: null
)
```

