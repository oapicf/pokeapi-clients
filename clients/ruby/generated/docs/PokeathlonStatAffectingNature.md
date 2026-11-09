# PokeApiClient::PokeathlonStatAffectingNature

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **max_change** | **Integer** | The maximum amount of change to the referenced Pokéathlon stat. |  |
| **nature** | [**NatureSummary**](NatureSummary.md) | The nature causing the change. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokeathlonStatAffectingNature.new(
  max_change: null,
  nature: null
)
```

