# PokeapiMetaResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeployDate** | **String** | The deployment time as a Unix timestamp string. | 
**Hash** | **String** | The source commit hash used for this deployment. | 
**Tag** | **String** | The deployment tag, or null if the deployment has no tag. | 

## Examples

- Prepare the resource
```powershell
$PokeapiMetaResponse = Initialize-PSOpenAPIToolsPokeapiMetaResponse  -DeployDate null `
 -Hash null `
 -Tag null
```

- Convert the resource to JSON
```powershell
$PokeapiMetaResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

