# BerryFirmnessDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Berries** | [**BerrySummary[]**](BerrySummary.md) | A list of the berries with this firmness. | [readonly] 
**Names** | [**BerryFirmnessName[]**](BerryFirmnessName.md) | The name of this resource listed in different languages. | [readonly] 

## Examples

- Prepare the resource
```powershell
$BerryFirmnessDetail = Initialize-PSOpenAPIToolsBerryFirmnessDetail  -Id null `
 -Name null `
 -Berries null `
 -Names null
```

- Convert the resource to JSON
```powershell
$BerryFirmnessDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

