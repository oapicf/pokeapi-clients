# PokeApiClient::PokemonGameIndex

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **game_index** | **Integer** | The internal id of an API resource within game data. |  |
| **version** | [**VersionSummary**](VersionSummary.md) | The version relevent to this game index. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonGameIndex.new(
  game_index: null,
  version: null
)
```

