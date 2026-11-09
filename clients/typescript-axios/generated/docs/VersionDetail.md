# VersionDetail

Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I\'m not sure how to add anything other than a hyperlink

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**names** | [**Array&lt;VersionName&gt;**](VersionName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group this version belongs to. | [default to undefined]

## Example

```typescript
import { VersionDetail } from './api';

const instance: VersionDetail = {
    id,
    name,
    names,
    version_group,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
