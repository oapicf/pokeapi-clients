# LocationDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**region** | [**RegionSummary**](RegionSummary.md) | The region this location can be found in. | [default to undefined]
**names** | [**Array&lt;LocationName&gt;**](LocationName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]
**game_indices** | [**Array&lt;LocationGameIndex&gt;**](LocationGameIndex.md) | A list of game indices relevent to this location by generation. | [readonly] [default to undefined]
**areas** | [**Array&lt;LocationAreaSummary&gt;**](LocationAreaSummary.md) | Areas that can be found within this location. | [readonly] [default to undefined]

## Example

```typescript
import { LocationDetail } from './api';

const instance: LocationDetail = {
    id,
    name,
    region,
    names,
    game_indices,
    areas,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
