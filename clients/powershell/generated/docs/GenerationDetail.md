# GenerationDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Abilities** | [**AbilitySummary[]**](AbilitySummary.md) | A list of abilities that were introduced in this generation. | [readonly] 
**MainRegion** | [**RegionSummary**](RegionSummary.md) | The main region travelled in this generation. | 
**Moves** | [**MoveSummary[]**](MoveSummary.md) | A list of moves that were introduced in this generation. | [readonly] 
**Names** | [**GenerationName[]**](GenerationName.md) | The name of this resource listed in different languages. | [readonly] 
**PokemonSpecies** | [**PokemonSpeciesSummary[]**](PokemonSpeciesSummary.md) | A list of Pokémon species that were introduced in this generation. | [readonly] 
**Types** | [**TypeSummary[]**](TypeSummary.md) | A list of types that were introduced in this generation. | [readonly] 
**VersionGroups** | [**VersionGroupSummary[]**](VersionGroupSummary.md) | A list of version groups that were introduced in this generation. | [readonly] 

## Examples

- Prepare the resource
```powershell
$GenerationDetail = Initialize-PSOpenAPIToolsGenerationDetail  -Id null `
 -Name null `
 -Abilities null `
 -MainRegion null `
 -Moves null `
 -Names null `
 -PokemonSpecies null `
 -Types null `
 -VersionGroups null
```

- Convert the resource to JSON
```powershell
$GenerationDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

