# PokeApiClient::StatDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **game_index** | **Integer** |  |  |
| **is_battle_only** | **Boolean** |  | [optional] |
| **affecting_moves** | [**StatDetailAffectingMoves**](StatDetailAffectingMoves.md) |  |  |
| **affecting_natures** | [**StatDetailAffectingNatures**](StatDetailAffectingNatures.md) |  |  |
| **characteristics** | [**Array&lt;CharacteristicSummary&gt;**](CharacteristicSummary.md) |  |  |
| **move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  |  |
| **names** | [**Array&lt;StatName&gt;**](StatName.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::StatDetail.new(
  id: null,
  name: null,
  game_index: null,
  is_battle_only: null,
  affecting_moves: null,
  affecting_natures: null,
  characteristics: null,
  move_damage_class: null,
  names: null
)
```

