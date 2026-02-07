# EvolutionChainDetailChainEvolvesToInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EvolutionDetails** | [**EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[]**](EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.md) |  | 
**IsBaby** | **Boolean** |  | 
**Species** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$EvolutionChainDetailChainEvolvesToInner = Initialize-PSOpenAPIToolsEvolutionChainDetailChainEvolvesToInner  -EvolutionDetails null `
 -IsBaby null `
 -Species null
```

- Convert the resource to JSON
```powershell
$EvolutionChainDetailChainEvolvesToInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

