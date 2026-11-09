# ItemFlingEffectDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**effect_entries** | [**Array&lt;ItemFlingEffectEffectText&gt;**](ItemFlingEffectEffectText.md) | The result of this fling effect listed in different languages. | [readonly] [default to undefined]
**items** | [**Array&lt;ItemSummary&gt;**](ItemSummary.md) | A list of items that have this fling effect. | [readonly] [default to undefined]

## Example

```typescript
import { ItemFlingEffectDetail } from './api';

const instance: ItemFlingEffectDetail = {
    id,
    name,
    effect_entries,
    items,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
