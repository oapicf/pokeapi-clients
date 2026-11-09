# MoveDamageClassDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**descriptions** | [**Array&lt;MoveDamageClassDescription&gt;**](MoveDamageClassDescription.md) | The description of this resource listed in different languages. | [readonly] [default to undefined]
**moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that fall into this damage class. | [readonly] [default to undefined]
**names** | [**Array&lt;MoveDamageClassName&gt;**](MoveDamageClassName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]

## Example

```typescript
import { MoveDamageClassDetail } from './api';

const instance: MoveDamageClassDetail = {
    id,
    name,
    descriptions,
    moves,
    names,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
