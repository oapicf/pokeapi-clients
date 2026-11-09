# MoveMeta


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ailment** | [**MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) | The status ailment this move inflicts on its target. | [default to undefined]
**category** | [**MoveMetaCategorySummary**](MoveMetaCategorySummary.md) | The category of move this move falls under, e.g. damage or ailment. | [default to undefined]
**min_hits** | **number** | The minimum number of times this move hits. Null if it always only hits once. | [optional] [default to undefined]
**max_hits** | **number** | The maximum number of times this move hits. Null if it always only hits once. | [optional] [default to undefined]
**min_turns** | **number** | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] [default to undefined]
**max_turns** | **number** | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] [default to undefined]
**drain** | **number** | HP drain (if positive) or Recoil damage (if negative), in percent of damage done. | [optional] [default to undefined]
**healing** | **number** | The amount of hp gained by the attacking Pokemon, in percent of it\&#39;s maximum HP. | [optional] [default to undefined]
**crit_rate** | **number** | Critical hit rate bonus. | [optional] [default to undefined]
**ailment_chance** | **number** | The likelihood this attack will cause an ailment. | [optional] [default to undefined]
**flinch_chance** | **number** | The likelihood this attack will cause the target Pokémon to flinch. | [optional] [default to undefined]
**stat_chance** | **number** | The likelihood this attack will cause a stat change in the target Pokémon. | [optional] [default to undefined]

## Example

```typescript
import { MoveMeta } from './api';

const instance: MoveMeta = {
    ailment,
    category,
    min_hits,
    max_hits,
    min_turns,
    max_turns,
    drain,
    healing,
    crit_rate,
    ailment_chance,
    flinch_chance,
    stat_chance,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
