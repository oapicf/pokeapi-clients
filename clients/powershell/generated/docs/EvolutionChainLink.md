# EvolutionChainLink
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsBaby** | **Boolean** | Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. | 
**Species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species at this point in the evolution chain. | 
**EvolutionDetails** | [**PokemonEvolution[]**](PokemonEvolution.md) | All details regarding the specific details of the referenced Pokémon species evolution. | 
**EvolvesTo** | [**EvolutionChainLink[]**](EvolutionChainLink.md) | A List of chain objects. | [readonly] 

## Examples

- Prepare the resource
```powershell
$EvolutionChainLink = Initialize-PSOpenAPIToolsEvolutionChainLink  -IsBaby null `
 -Species null `
 -EvolutionDetails null `
 -EvolvesTo null
```

- Convert the resource to JSON
```powershell
$EvolutionChainLink | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

