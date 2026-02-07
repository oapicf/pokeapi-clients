# NatureDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** |  | [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**decreased_stat** | [**StatSummary**](StatSummary.md) |  | [default to undefined]
**increased_stat** | [**StatSummary**](StatSummary.md) |  | [default to undefined]
**likes_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  | [default to undefined]
**hates_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  | [default to undefined]
**berries** | [**Array&lt;BerrySummary&gt;**](BerrySummary.md) |  | [default to undefined]
**pokeathlon_stat_changes** | [**Array&lt;NatureDetailPokeathlonStatChangesInner&gt;**](NatureDetailPokeathlonStatChangesInner.md) |  | [default to undefined]
**move_battle_style_preferences** | [**Array&lt;NatureBattleStylePreference&gt;**](NatureBattleStylePreference.md) |  | [default to undefined]
**names** | [**Array&lt;NatureName&gt;**](NatureName.md) |  | [default to undefined]

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
    berries,
    pokeathlon_stat_changes,
    move_battle_style_preferences,
    names,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
