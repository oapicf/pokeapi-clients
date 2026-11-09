# ItemPrice


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purchase_price** | **number** | The purchase price in this currency and version group, or null if unavailable. | [optional] [default to undefined]
**sell_price** | **number** | The sell price in this currency and version group, or null if unavailable. | [optional] [default to undefined]
**currency** | [**CurrencySummary**](CurrencySummary.md) | The currency used for this price. | [default to undefined]
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group to which this price applies. | [default to undefined]

## Example

```typescript
import { ItemPrice } from './api';

const instance: ItemPrice = {
    purchase_price,
    sell_price,
    currency,
    version_group,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
