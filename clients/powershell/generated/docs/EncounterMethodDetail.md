# EncounterMethodDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Order** | **Int32** |  | [optional] 
**Names** | [**EncounterMethodName[]**](EncounterMethodName.md) |  | 

## Examples

- Prepare the resource
```powershell
$EncounterMethodDetail = Initialize-PSOpenAPIToolsEncounterMethodDetail  -Id null `
 -Name null `
 -Order null `
 -Names null
```

- Convert the resource to JSON
```powershell
$EncounterMethodDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

