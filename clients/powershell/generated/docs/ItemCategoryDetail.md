# ItemCategoryDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Items** | [**ItemSummary[]**](ItemSummary.md) |  | 
**Names** | [**ItemCategoryName[]**](ItemCategoryName.md) |  | 
**Pocket** | [**ItemPocketSummary**](ItemPocketSummary.md) |  | 

## Examples

- Prepare the resource
```powershell
$ItemCategoryDetail = Initialize-PSOpenAPIToolsItemCategoryDetail  -Id null `
 -Name null `
 -Items null `
 -Names null `
 -Pocket null
```

- Convert the resource to JSON
```powershell
$ItemCategoryDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

