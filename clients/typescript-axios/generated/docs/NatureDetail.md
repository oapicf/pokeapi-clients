# NatureDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**decreased_stat** | [**StatSummary**](StatSummary.md) | The stat decreased by 10% in Pokémon with this nature. | [default to undefined]
**increased_stat** | [**StatSummary**](StatSummary.md) | The stat increased by 10% in Pokémon with this nature. | [default to undefined]
**likes_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor liked by Pokémon with this nature. | [default to undefined]
**hates_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor hated by Pokémon with this nature. | [default to undefined]
**pokeathlon_stat_changes** | [**Array&lt;NaturePokeathlonStat&gt;**](NaturePokeathlonStat.md) | A list of Pokéathlon stats this nature effects and how much it effects them. | [readonly] [default to undefined]
**move_battle_style_preferences** | [**Array&lt;NatureBattleStylePreference&gt;**](NatureBattleStylePreference.md) | A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. | [readonly] [default to undefined]
**names** | [**Array&lt;NatureName&gt;**](NatureName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]

## Example

```typescript
import { NatureDetail } from './api';

const instance: NatureDetail = {
    id,
    name,
    decreased_stat,
    increased_stat,
    likes_flavor,
    hates_flavor,
    pokeathlon_stat_changes,
    move_battle_style_preferences,
    names,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
