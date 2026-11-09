# EvolutionTriggerDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Names** | [**EvolutionTriggerName[]**](EvolutionTriggerName.md) | The name of this resource listed in different languages. | [readonly] 
**PokemonSpecies** | [**PokemonSpeciesSummary[]**](PokemonSpeciesSummary.md) | A list of pokemon species that result from this evolution trigger. | [readonly] 

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

