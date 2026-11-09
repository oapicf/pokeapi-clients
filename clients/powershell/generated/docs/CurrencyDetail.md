# CurrencyDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Names** | [**CurrencyName[]**](CurrencyName.md) | The name of this resource listed in different languages. | [readonly] 

## Examples

- Prepare the resource
```powershell
$CurrencyDetail = Initialize-PSOpenAPIToolsCurrencyDetail  -Id null `
 -Name null `
 -Names null
```

- Convert the resource to JSON
```powershell
$CurrencyDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

