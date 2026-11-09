# EncounterConditionDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**values** | [**Array&lt;EncounterConditionValueSummary&gt;**](EncounterConditionValueSummary.md) | A list of possible values for this encounter condition. | [readonly] [default to undefined]
**names** | [**Array&lt;EncounterConditionName&gt;**](EncounterConditionName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]

## Example

```typescript
import { EncounterConditionDetail } from './api';

const instance: EncounterConditionDetail = {
    id,
    name,
    values,
    names,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
