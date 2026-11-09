# ContestTypeDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**BerryFlavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The berry flavor that correlates with this contest type. | [readonly] 
**Names** | [**ContestTypeName[]**](ContestTypeName.md) | The name of this contest type listed in different languages. | [readonly] 

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

