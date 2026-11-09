# EncounterMethodDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Order** | **Int32** | A good value for sorting. | [optional] 
**Names** | [**EncounterMethodName[]**](EncounterMethodName.md) | The name of this resource listed in different languages. | [readonly] 

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

