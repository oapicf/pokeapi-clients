# ItemPocketDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**categories** | [**Array&lt;ItemCategorySummary&gt;**](ItemCategorySummary.md) | A list of item categories that are relevant to this item pocket. | [readonly] [default to undefined]
**names** | [**Array&lt;ItemPocketName&gt;**](ItemPocketName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]

## Example

```typescript
import { ItemPocketDetail } from './api';

const instance: ItemPocketDetail = {
    id,
    name,
    categories,
    names,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
