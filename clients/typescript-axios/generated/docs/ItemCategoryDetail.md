# ItemCategoryDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**items** | [**Array&lt;ItemSummary&gt;**](ItemSummary.md) | A list of items that are a part of this category. | [readonly] [default to undefined]
**names** | [**Array&lt;ItemCategoryName&gt;**](ItemCategoryName.md) | The name of this item category listed in different languages. | [readonly] [default to undefined]
**pocket** | [**ItemPocketSummary**](ItemPocketSummary.md) | The pocket items in this category would be put in. | [default to undefined]

## Example

```typescript
import { ItemCategoryDetail } from './api';

const instance: ItemCategoryDetail = {
    id,
    name,
    items,
    names,
    pocket,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
