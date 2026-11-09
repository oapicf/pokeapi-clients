# ItemFlingEffectDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**EffectEntries** | [**ItemFlingEffectEffectText[]**](ItemFlingEffectEffectText.md) | The result of this fling effect listed in different languages. | [readonly] 
**Items** | [**ItemSummary[]**](ItemSummary.md) | A list of items that have this fling effect. | [readonly] 

## Examples

- Prepare the resource
```powershell
$ItemFlingEffectDetail = Initialize-PSOpenAPIToolsItemFlingEffectDetail  -Id null `
 -Name null `
 -EffectEntries null `
 -Items null
```

- Convert the resource to JSON
```powershell
$ItemFlingEffectDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

