# NatureBattleStylePreference


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**low_hp_preference** | **number** | Chance of using the move, in percent, if HP is under one half. | [default to undefined]
**high_hp_preference** | **number** | Chance of using the move, in percent, if HP is over one half. | [default to undefined]
**move_battle_style** | [**MoveBattleStyleSummary**](MoveBattleStyleSummary.md) | The move battle style. | [default to undefined]

## Example

```typescript
import { NatureBattleStylePreference } from './api';

const instance: NatureBattleStylePreference = {
    low_hp_preference,
    high_hp_preference,
    move_battle_style,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
