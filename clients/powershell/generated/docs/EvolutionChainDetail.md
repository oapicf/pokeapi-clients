# EvolutionChainDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**BabyTriggerItem** | [**ItemSummary**](ItemSummary.md) |  | 
**Chain** | [**EvolutionChainDetailChain**](EvolutionChainDetailChain.md) |  | 

## Examples

- Prepare the resource
```powershell
$EvolutionChainDetail = Initialize-PSOpenAPIToolsEvolutionChainDetail  -Id null `
 -BabyTriggerItem null `
 -Chain null
```

- Convert the resource to JSON
```powershell
$EvolutionChainDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

