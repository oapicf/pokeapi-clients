# MoveChange


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accuracy** | **number** | The percent value of how likely this move is to be successful. | [optional] [default to undefined]
**power** | **number** | The base power before the listed version group, or null if power did not change. | [optional] [default to undefined]
**pp** | **number** | Power points. The number of times this move can be used. | [optional] [default to undefined]
**effect_chance** | **number** | The percent value of how likely it is this moves effect will take effect. | [default to undefined]
**effect_entries** | [**Array&lt;MoveEffectEffectText&gt;**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] [default to undefined]
**type** | [**TypeSummary**](TypeSummary.md) | The elemental type of this move. | [default to undefined]
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which these move stat values were in effect. | [default to undefined]

## Example

```typescript
import { MoveChange } from './api';

const instance: MoveChange = {
    accuracy,
    power,
    pp,
    effect_chance,
    effect_entries,
    type,
    version_group,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
