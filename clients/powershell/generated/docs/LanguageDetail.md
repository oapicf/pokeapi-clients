# LanguageDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Official** | **Boolean** | Whether or not the games are published in this language. | [optional] 
**Iso639** | **String** | The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code. | 
**Iso3166** | **String** | The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code. | 
**Names** | [**LanguageName[]**](LanguageName.md) | The name of this resource listed in different languages. | [readonly] 

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

