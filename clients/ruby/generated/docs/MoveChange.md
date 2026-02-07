# PokeApiClient::MoveChange

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **accuracy** | **Integer** |  | [optional] |
| **power** | **Integer** |  | [optional] |
| **pp** | **Integer** |  | [optional] |
| **effect_chance** | **Integer** |  |  |
| **effect_entries** | [**Array&lt;MoveChangeEffectEntriesInner&gt;**](MoveChangeEffectEntriesInner.md) |  |  |
| **type** | [**TypeSummary**](TypeSummary.md) |  |  |
| **version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) |  |  |

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

