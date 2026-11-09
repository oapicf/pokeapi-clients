# PokeApiClient::StatDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **game_index** | **Integer** | ID the games use for this stat. |  |
| **is_battle_only** | **Boolean** | Whether this stat only exists within a battle. | [optional] |
| **affecting_moves** | [**StatAffectingMoves**](StatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. | [readonly] |
| **affecting_natures** | [**StatAffectingNatures**](StatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. | [readonly] |
| **affecting_items** | [**Array&lt;ItemSummary&gt;**](ItemSummary.md) | Items that affect this stat, such as vitamins and battle items. | [readonly] |
| **characteristics** | [**Array&lt;CharacteristicSummary&gt;**](CharacteristicSummary.md) | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. | [readonly] |
| **move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage this stat is directly related to. |  |
| **names** | [**Array&lt;StatName&gt;**](StatName.md) | The name of this resource listed in different languages. | [readonly] |

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
  affecting_items: null,
  characteristics: null,
  move_damage_class: null,
  names: null
)
```

