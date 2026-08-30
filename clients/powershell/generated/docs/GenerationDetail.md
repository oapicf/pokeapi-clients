# GenerationDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Abilities** | [**AbilitySummary[]**](AbilitySummary.md) |  | [readonly] 
**MainRegion** | [**RegionSummary**](RegionSummary.md) |  | 
**Moves** | [**MoveSummary[]**](MoveSummary.md) |  | [readonly] 
**Names** | [**GenerationName[]**](GenerationName.md) |  | [readonly] 
**PokemonSpecies** | [**PokemonSpeciesSummary[]**](PokemonSpeciesSummary.md) |  | [readonly] 
**Types** | [**TypeSummary[]**](TypeSummary.md) |  | [readonly] 
**VersionGroups** | [**VersionGroupSummary[]**](VersionGroupSummary.md) |  | [readonly] 

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

