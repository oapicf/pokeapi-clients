# BerryDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**growth_time** | **number** | Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. | [optional] [default to undefined]
**max_harvest** | **number** | The maximum number of these berries that can grow on one tree in Generation IV. | [optional] [default to undefined]
**natural_gift_power** | **number** | The power of the move \&quot;Natural Gift\&quot; when used with this Berry. | [optional] [default to undefined]
**size** | **number** | The size of this Berry, in millimeters. | [optional] [default to undefined]
**smoothness** | **number** | The smoothness of this Berry, used in making Pokéblocks or Poffins. | [optional] [default to undefined]
**soil_dryness** | **number** | The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. | [optional] [default to undefined]
**firmness** | [**BerryFirmnessSummary**](BerryFirmnessSummary.md) | The firmness of this berry, used in making Pokéblocks or Poffins. | [default to undefined]
**flavors** | [**Array&lt;BerryFlavorMap&gt;**](BerryFlavorMap.md) | A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. | [readonly] [default to undefined]
**item** | [**ItemSummary**](ItemSummary.md) | Berries are actually items. This is a reference to the item specific data for this berry. | [default to undefined]
**natural_gift_type** | [**TypeSummary**](TypeSummary.md) | The type inherited by \&quot;Natural Gift\&quot; when used with this Berry. | [default to undefined]

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
