# BerryFirmnessDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**berries** | [**Array&lt;BerrySummary&gt;**](BerrySummary.md) | A list of the berries with this firmness. | [readonly] [default to undefined]
**names** | [**Array&lt;BerryFirmnessName&gt;**](BerryFirmnessName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]

## Example

```typescript
import { BerryFirmnessDetail } from './api';

const instance: BerryFirmnessDetail = {
    id,
    name,
    berries,
    names,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
