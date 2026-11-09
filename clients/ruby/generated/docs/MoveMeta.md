# PokeApiClient::MoveMeta

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ailment** | [**MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) | The status ailment this move inflicts on its target. |  |
| **category** | [**MoveMetaCategorySummary**](MoveMetaCategorySummary.md) | The category of move this move falls under, e.g. damage or ailment. |  |
| **min_hits** | **Integer** | The minimum number of times this move hits. Null if it always only hits once. | [optional] |
| **max_hits** | **Integer** | The maximum number of times this move hits. Null if it always only hits once. | [optional] |
| **min_turns** | **Integer** | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] |
| **max_turns** | **Integer** | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] |
| **drain** | **Integer** | HP drain (if positive) or Recoil damage (if negative), in percent of damage done. | [optional] |
| **healing** | **Integer** | The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP. | [optional] |
| **crit_rate** | **Integer** | Critical hit rate bonus. | [optional] |
| **ailment_chance** | **Integer** | The likelihood this attack will cause an ailment. | [optional] |
| **flinch_chance** | **Integer** | The likelihood this attack will cause the target Pokémon to flinch. | [optional] |
| **stat_chance** | **Integer** | The likelihood this attack will cause a stat change in the target Pokémon. | [optional] |

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

