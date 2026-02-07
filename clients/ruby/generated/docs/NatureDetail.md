# PokeApiClient::NatureDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **decreased_stat** | [**StatSummary**](StatSummary.md) |  |  |
| **increased_stat** | [**StatSummary**](StatSummary.md) |  |  |
| **likes_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  |  |
| **hates_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  |  |
| **berries** | [**Array&lt;BerrySummary&gt;**](BerrySummary.md) |  |  |
| **pokeathlon_stat_changes** | [**Array&lt;NatureDetailPokeathlonStatChangesInner&gt;**](NatureDetailPokeathlonStatChangesInner.md) |  |  |
| **move_battle_style_preferences** | [**Array&lt;NatureBattleStylePreference&gt;**](NatureBattleStylePreference.md) |  |  |
| **names** | [**Array&lt;NatureName&gt;**](NatureName.md) |  |  |

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
  berries: null,
  pokeathlon_stat_changes: null,
  move_battle_style_preferences: null,
  names: null
)
```

