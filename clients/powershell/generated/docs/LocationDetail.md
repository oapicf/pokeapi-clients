# LocationDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Region** | [**RegionSummary**](RegionSummary.md) |  | 
**Names** | [**LocationName[]**](LocationName.md) |  | 
**GameIndices** | [**LocationGameIndex[]**](LocationGameIndex.md) |  | 
**Areas** | [**LocationAreaSummary[]**](LocationAreaSummary.md) |  | 

## Examples

- Prepare the resource
```powershell
$LocationDetail = Initialize-PSOpenAPIToolsLocationDetail  -Id null `
 -Name null `
 -Region null `
 -Names null `
 -GameIndices null `
 -Areas null
```

- Convert the resource to JSON
```powershell
$LocationDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

