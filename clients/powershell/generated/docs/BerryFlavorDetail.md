# BerryFlavorDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Berries** | [**BerryFlavorDetailBerriesInner[]**](BerryFlavorDetailBerriesInner.md) |  | 
**ContestType** | [**ContestTypeSummary**](ContestTypeSummary.md) |  | 
**Names** | [**BerryFlavorName[]**](BerryFlavorName.md) |  | 

## Examples

- Prepare the resource
```powershell
$BerryFlavorDetail = Initialize-PSOpenAPIToolsBerryFlavorDetail  -Id null `
 -Name null `
 -Berries null `
 -ContestType null `
 -Names null
```

- Convert the resource to JSON
```powershell
$BerryFlavorDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

