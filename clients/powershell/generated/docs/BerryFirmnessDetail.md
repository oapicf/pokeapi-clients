# BerryFirmnessDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Berries** | [**BerrySummary[]**](BerrySummary.md) |  | 
**Names** | [**BerryFirmnessName[]**](BerryFirmnessName.md) |  | 

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

