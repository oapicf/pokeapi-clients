# AbilityChange


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which the previous effect of this ability originated. | [default to undefined]
**effect_entries** | [**Array&lt;AbilityChangeEffectText&gt;**](AbilityChangeEffectText.md) | The previous effect of this ability listed in different languages. | [readonly] [default to undefined]

## Example

```typescript
import { AbilityChange } from './api';

const instance: AbilityChange = {
    version_group,
    effect_entries,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
