# PokeApiClient::NatureBattleStylePreference

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **low_hp_preference** | **Integer** | Chance of using the move, in percent, if HP is under one half. |  |
| **high_hp_preference** | **Integer** | Chance of using the move, in percent, if HP is over one half. |  |
| **move_battle_style** | [**MoveBattleStyleSummary**](MoveBattleStyleSummary.md) | The move battle style. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::NatureBattleStylePreference.new(
  low_hp_preference: null,
  high_hp_preference: null,
  move_battle_style: null
)
```

