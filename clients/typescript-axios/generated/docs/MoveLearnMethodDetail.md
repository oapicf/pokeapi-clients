# MoveLearnMethodDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**names** | [**Array&lt;MoveLearnMethodName&gt;**](MoveLearnMethodName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]
**descriptions** | [**Array&lt;MoveLearnMethodDescription&gt;**](MoveLearnMethodDescription.md) | The description of this resource listed in different languages. | [readonly] [default to undefined]
**version_groups** | [**Array&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) | A list of version groups where moves can be learned through this method. | [readonly] [default to undefined]

## Example

```typescript
import { MoveLearnMethodDetail } from './api';

const instance: MoveLearnMethodDetail = {
    id,
    name,
    names,
    descriptions,
    version_groups,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
