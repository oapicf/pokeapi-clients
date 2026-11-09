# ItemPocketDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Categories** | [**ItemCategorySummary[]**](ItemCategorySummary.md) | A list of item categories that are relevant to this item pocket. | [readonly] 
**Names** | [**ItemPocketName[]**](ItemPocketName.md) | The name of this resource listed in different languages. | [readonly] 

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

