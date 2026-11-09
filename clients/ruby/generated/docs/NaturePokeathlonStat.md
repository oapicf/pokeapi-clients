# PokeApiClient::NaturePokeathlonStat

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **max_change** | **Integer** | The amount of change. |  |
| **pokeathlon_stat** | [**PokeathlonStatSummary**](PokeathlonStatSummary.md) | The stat being affected. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::NaturePokeathlonStat.new(
  max_change: null,
  pokeathlon_stat: null
)
```

