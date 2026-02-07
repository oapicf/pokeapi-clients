# ItemFlingEffectDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**EffectEntries** | [**ItemFlingEffectEffectText[]**](ItemFlingEffectEffectText.md) |  | 
**Items** | [**ItemSummary[]**](ItemSummary.md) |  | 

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

