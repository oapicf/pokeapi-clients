# MoveMetaAilmentDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that cause this ailment. | [readonly] [default to undefined]
**names** | [**Array&lt;MoveMetaAilmentName&gt;**](MoveMetaAilmentName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]

## Example

```typescript
import { MoveMetaAilmentDetail } from './api';

const instance: MoveMetaAilmentDetail = {
    id,
    name,
    moves,
    names,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
