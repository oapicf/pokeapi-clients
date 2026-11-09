# EncounterConditionValueDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**condition** | [**EncounterConditionSummary**](EncounterConditionSummary.md) | The condition this encounter condition value pertains to. | [default to undefined]
**names** | [**Array&lt;EncounterConditionValueName&gt;**](EncounterConditionValueName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]

## Example

```typescript
import { EncounterConditionValueDetail } from './api';

const instance: EncounterConditionValueDetail = {
    id,
    name,
    condition,
    names,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
