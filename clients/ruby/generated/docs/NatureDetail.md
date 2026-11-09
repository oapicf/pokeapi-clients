# PokeApiClient::NatureDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **decreased_stat** | [**StatSummary**](StatSummary.md) | The stat decreased by 10% in Pokémon with this nature. |  |
| **increased_stat** | [**StatSummary**](StatSummary.md) | The stat increased by 10% in Pokémon with this nature. |  |
| **likes_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor liked by Pokémon with this nature. |  |
| **hates_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor hated by Pokémon with this nature. |  |
| **pokeathlon_stat_changes** | [**Array&lt;NaturePokeathlonStat&gt;**](NaturePokeathlonStat.md) | A list of Pokéathlon stats this nature effects and how much it effects them. | [readonly] |
| **move_battle_style_preferences** | [**Array&lt;NatureBattleStylePreference&gt;**](NatureBattleStylePreference.md) | A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. | [readonly] |
| **names** | [**Array&lt;NatureName&gt;**](NatureName.md) | The name of this resource listed in different languages. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::NatureDetail.new(
  id: null,
  name: null,
  decreased_stat: null,
  increased_stat: null,
  likes_flavor: null,
  hates_flavor: null,
  pokeathlon_stat_changes: null,
  move_battle_style_preferences: null,
  names: null
)
```

