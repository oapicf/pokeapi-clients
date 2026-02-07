# EvolutionChainDetailChain
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EvolutionDetails** | [**AnyType[]**](AnyType.md) |  | 
**EvolvesTo** | [**EvolutionChainDetailChainEvolvesToInner[]**](EvolutionChainDetailChainEvolvesToInner.md) |  | 
**IsBaby** | **Boolean** |  | 
**Species** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$EvolutionChainDetailChain = Initialize-PSOpenAPIToolsEvolutionChainDetailChain  -EvolutionDetails null `
 -EvolvesTo null `
 -IsBaby null `
 -Species null
```

- Convert the resource to JSON
```powershell
$EvolutionChainDetailChain | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

