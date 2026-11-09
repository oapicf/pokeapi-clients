# PokeApiClient::MoveChange

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **accuracy** | **Integer** | The percent value of how likely this move is to be successful. | [optional] |
| **power** | **Integer** | The base power before the listed version group, or null if power did not change. | [optional] |
| **pp** | **Integer** | Power points. The number of times this move can be used. | [optional] |
| **effect_chance** | **Integer** | The percent value of how likely it is this moves effect will take effect. |  |
| **effect_entries** | [**Array&lt;MoveEffectEffectText&gt;**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] |
| **type** | [**TypeSummary**](TypeSummary.md) | The elemental type of this move. |  |
| **version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which these move stat values were in effect. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::MoveChange.new(
  accuracy: null,
  power: null,
  pp: null,
  effect_chance: null,
  effect_entries: null,
  type: null,
  version_group: null
)
```

