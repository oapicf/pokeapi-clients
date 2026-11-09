# ItemAttributeDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**descriptions** | [**Array&lt;ItemAttributeDescription&gt;**](ItemAttributeDescription.md) | The description of this item attribute listed in different languages. | [readonly] [default to undefined]
**items** | [**Array&lt;ItemSummary&gt;**](ItemSummary.md) | A list of items that have this attribute. | [readonly] [default to undefined]
**names** | [**Array&lt;ItemAttributeName&gt;**](ItemAttributeName.md) | The name of this item attribute listed in different languages. | [readonly] [default to undefined]

## Example

```typescript
import { ItemAttributeDetail } from './api';

const instance: ItemAttributeDetail = {
    id,
    name,
    descriptions,
    items,
    names,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
