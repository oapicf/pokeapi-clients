# EvolutionTriggerDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Names** | [**EvolutionTriggerName[]**](EvolutionTriggerName.md) |  | 
**PokemonSpecies** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$EvolutionTriggerDetail = Initialize-PSOpenAPIToolsEvolutionTriggerDetail  -Id null `
 -Name null `
 -Names null `
 -PokemonSpecies null
```

- Convert the resource to JSON
```powershell
$EvolutionTriggerDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

