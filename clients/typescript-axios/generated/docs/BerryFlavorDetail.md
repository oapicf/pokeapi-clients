# BerryFlavorDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**berries** | [**Array&lt;BerryFlavorBerryMap&gt;**](BerryFlavorBerryMap.md) | A list of the berries with this flavor. | [readonly] [default to undefined]
**contest_type** | [**ContestTypeSummary**](ContestTypeSummary.md) | The contest type that correlates with this berry flavor. | [default to undefined]
**names** | [**Array&lt;BerryFlavorName&gt;**](BerryFlavorName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]

## Example

```typescript
import { BerryFlavorDetail } from './api';

const instance: BerryFlavorDetail = {
    id,
    name,
    berries,
    contest_type,
    names,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
