# ItemPocketDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Categories** | [**ItemCategorySummary[]**](ItemCategorySummary.md) |  | 
**Names** | [**ItemPocketName[]**](ItemPocketName.md) |  | 

## Examples

- Prepare the resource
```powershell
$ItemPocketDetail = Initialize-PSOpenAPIToolsItemPocketDetail  -Id null `
 -Name null `
 -Categories null `
 -Names null
```

- Convert the resource to JSON
```powershell
$ItemPocketDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

