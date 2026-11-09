# ContestTypeDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**berry_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The berry flavor that correlates with this contest type. | [readonly] [default to undefined]
**names** | [**Array&lt;ContestTypeName&gt;**](ContestTypeName.md) | The name of this contest type listed in different languages. | [readonly] [default to undefined]

## Example

```typescript
import { ContestTypeDetail } from './api';

const instance: ContestTypeDetail = {
    id,
    name,
    berry_flavor,
    names,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
