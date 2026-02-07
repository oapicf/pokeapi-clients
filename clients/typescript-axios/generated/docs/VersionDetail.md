# VersionDetail

Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I\'m not sure how to add anything other than a hyperlink

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** |  | [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**names** | [**Array&lt;VersionName&gt;**](VersionName.md) |  | [default to undefined]
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | [default to undefined]

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
