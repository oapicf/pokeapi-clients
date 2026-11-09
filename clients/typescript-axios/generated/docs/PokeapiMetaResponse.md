# PokeapiMetaResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deploy_date** | **string** | The deployment time as a Unix timestamp string. | [default to undefined]
**hash** | **string** | The source commit hash used for this deployment. | [default to undefined]
**tag** | **string** | The deployment tag, or null if the deployment has no tag. | [default to undefined]

## Example

```typescript
import { PokeapiMetaResponse } from './api';

const instance: PokeapiMetaResponse = {
    deploy_date,
    hash,
    tag,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
