# VersionDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Names** | [**VersionName[]**](VersionName.md) |  | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 

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

