# PokeApiClient::MoveMeta

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ailment** | [**MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) |  |  |
| **category** | [**MoveMetaCategorySummary**](MoveMetaCategorySummary.md) |  |  |
| **min_hits** | **Integer** |  | [optional] |
| **max_hits** | **Integer** |  | [optional] |
| **min_turns** | **Integer** |  | [optional] |
| **max_turns** | **Integer** |  | [optional] |
| **drain** | **Integer** |  | [optional] |
| **healing** | **Integer** |  | [optional] |
| **crit_rate** | **Integer** |  | [optional] |
| **ailment_chance** | **Integer** |  | [optional] |
| **flinch_chance** | **Integer** |  | [optional] |
| **stat_chance** | **Integer** |  | [optional] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::MoveMeta.new(
  ailment: null,
  category: null,
  min_hits: null,
  max_hits: null,
  min_turns: null,
  max_turns: null,
  drain: null,
  healing: null,
  crit_rate: null,
  ailment_chance: null,
  flinch_chance: null,
  stat_chance: null
)
```

