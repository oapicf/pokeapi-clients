# BerryDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** |  | [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**growth_time** | **number** |  | [default to undefined]
**max_harvest** | **number** |  | [default to undefined]
**natural_gift_power** | **number** |  | [default to undefined]
**size** | **number** |  | [default to undefined]
**smoothness** | **number** |  | [default to undefined]
**soil_dryness** | **number** |  | [default to undefined]
**firmness** | [**BerryFirmnessSummary**](BerryFirmnessSummary.md) |  | [default to undefined]
**flavors** | [**Array&lt;BerryDetailFlavorsInner&gt;**](BerryDetailFlavorsInner.md) |  | [default to undefined]
**item** | [**ItemSummary**](ItemSummary.md) |  | [default to undefined]
**natural_gift_type** | [**TypeSummary**](TypeSummary.md) |  | [default to undefined]

## Example

```typescript
import { BerryDetail } from './api';

const instance: BerryDetail = {
    id,
    name,
    growth_time,
    max_harvest,
    natural_gift_power,
    size,
    smoothness,
    soil_dryness,
    firmness,
    flavors,
    item,
    natural_gift_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
