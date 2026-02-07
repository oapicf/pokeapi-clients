# LanguageDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Official** | **Boolean** |  | [optional] 
**Iso639** | **String** |  | 
**Iso3166** | **String** |  | 
**Names** | [**LanguageName[]**](LanguageName.md) |  | 

## Examples

- Prepare the resource
```powershell
$LanguageDetail = Initialize-PSOpenAPIToolsLanguageDetail  -Id null `
 -Name null `
 -Official null `
 -Iso639 null `
 -Iso3166 null `
 -Names null
```

- Convert the resource to JSON
```powershell
$LanguageDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

