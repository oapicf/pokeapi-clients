# ItemCategoryDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Items** | [**ItemSummary[]**](ItemSummary.md) | A list of items that are a part of this category. | [readonly] 
**Names** | [**ItemCategoryName[]**](ItemCategoryName.md) | The name of this item category listed in different languages. | [readonly] 
**Pocket** | [**ItemPocketSummary**](ItemPocketSummary.md) | The pocket items in this category would be put in. | 

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

