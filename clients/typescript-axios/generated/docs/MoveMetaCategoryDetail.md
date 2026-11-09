# MoveMetaCategoryDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**descriptions** | [**Array&lt;MoveMetaCategoryDescription&gt;**](MoveMetaCategoryDescription.md) | The description of this resource listed in different languages. | [readonly] [default to undefined]
**moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that fall into this category. | [readonly] [default to undefined]

## Example

```typescript
import { MoveMetaCategoryDetail } from './api';

const instance: MoveMetaCategoryDetail = {
    id,
    name,
    descriptions,
    moves,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
