# LocationDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Region** | [**RegionSummary**](RegionSummary.md) | The region this location can be found in. | 
**Names** | [**LocationName[]**](LocationName.md) | The name of this resource listed in different languages. | [readonly] 
**GameIndices** | [**LocationGameIndex[]**](LocationGameIndex.md) | A list of game indices relevent to this location by generation. | [readonly] 
**Areas** | [**LocationAreaSummary[]**](LocationAreaSummary.md) | Areas that can be found within this location. | [readonly] 

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

