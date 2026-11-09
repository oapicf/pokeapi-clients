# ItemAttributeDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Descriptions** | [**ItemAttributeDescription[]**](ItemAttributeDescription.md) | The description of this item attribute listed in different languages. | [readonly] 
**Items** | [**ItemSummary[]**](ItemSummary.md) | A list of items that have this attribute. | [readonly] 
**Names** | [**ItemAttributeName[]**](ItemAttributeName.md) | The name of this item attribute listed in different languages. | [readonly] 

## Examples

- Prepare the resource
```powershell
$ItemAttributeDetail = Initialize-PSOpenAPIToolsItemAttributeDetail  -Id null `
 -Name null `
 -Descriptions null `
 -Items null `
 -Names null
```

- Convert the resource to JSON
```powershell
$ItemAttributeDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

