# PokeApiClient::TypeGameIndex

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **game_index** | **Integer** | The internal id of an API resource within game data. |  |
| **generation** | [**GenerationSummary**](GenerationSummary.md) | The generation relevent to this game index. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::TypeGameIndex.new(
  game_index: null,
  generation: null
)
```

