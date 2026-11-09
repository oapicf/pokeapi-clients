# VersionDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Names** | [**VersionName[]**](VersionName.md) | The name of this resource listed in different languages. | [readonly] 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group this version belongs to. | 

## Examples

- Prepare the resource
```powershell
$VersionDetail = Initialize-PSOpenAPIToolsVersionDetail  -Id null `
 -Name null `
 -Names null `
 -VersionGroup null
```

- Convert the resource to JSON
```powershell
$VersionDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

