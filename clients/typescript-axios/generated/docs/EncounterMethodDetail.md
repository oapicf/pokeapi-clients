# EncounterMethodDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**order** | **number** | A good value for sorting. | [optional] [default to undefined]
**names** | [**Array&lt;EncounterMethodName&gt;**](EncounterMethodName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]

## Example

```typescript
import { EncounterMethodDetail } from './api';

const instance: EncounterMethodDetail = {
    id,
    name,
    order,
    names,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
