# EvolutionChainDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**BabyTriggerItem** | [**ItemSummary**](ItemSummary.md) | The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon. | 
**Chain** | [**EvolutionChainLink**](EvolutionChainLink.md) | The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order. | [readonly] 

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

