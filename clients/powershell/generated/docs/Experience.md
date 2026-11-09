# Experience
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Level** | **Int32** | The level gained. | 
**Experience** | **Int32** | The amount of experience required to reach the referenced level. | 

## Examples

- Prepare the resource
```powershell
$Experience = Initialize-PSOpenAPIToolsExperience  -Level null `
 -Experience null
```

- Convert the resource to JSON
```powershell
$Experience | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

