# PokeApiClient::MoveMetaStatChange

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **change** | **Integer** | The amount of change. |  |
| **stat** | [**StatSummary**](StatSummary.md) | The stat being affected. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::MoveMetaStatChange.new(
  change: null,
  stat: null
)
```

