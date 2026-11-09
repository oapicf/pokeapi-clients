# PokeApiClient::MoveStatChange

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **change** | **Integer** | The maximum amount of change to the referenced stat. |  |
| **move** | [**MoveSummary**](MoveSummary.md) | The move causing the change. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::MoveStatChange.new(
  change: null,
  move: null
)
```

