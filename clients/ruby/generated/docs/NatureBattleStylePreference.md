# PokeApiClient::NatureBattleStylePreference

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **low_hp_preference** | **Integer** |  |  |
| **high_hp_preference** | **Integer** |  |  |
| **move_battle_style** | [**MoveBattleStyleSummary**](MoveBattleStyleSummary.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::NatureBattleStylePreference.new(
  low_hp_preference: null,
  high_hp_preference: null,
  move_battle_style: null
)
```

