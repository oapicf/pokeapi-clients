# ContestTypeDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**BerryFlavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  | [readonly] 
**Names** | [**ContestTypeName[]**](ContestTypeName.md) |  | 

## Examples

- Prepare the resource
```powershell
$ContestTypeDetail = Initialize-PSOpenAPIToolsContestTypeDetail  -Id null `
 -Name null `
 -BerryFlavor null `
 -Names null
```

- Convert the resource to JSON
```powershell
$ContestTypeDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

