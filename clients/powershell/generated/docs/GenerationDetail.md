# GenerationDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Abilities** | [**AbilitySummary[]**](AbilitySummary.md) |  | 
**MainRegion** | [**RegionSummary**](RegionSummary.md) |  | 
**Moves** | [**MoveSummary[]**](MoveSummary.md) |  | 
**Names** | [**GenerationName[]**](GenerationName.md) |  | 
**PokemonSpecies** | [**PokemonSpeciesSummary[]**](PokemonSpeciesSummary.md) |  | 
**Types** | [**TypeSummary[]**](TypeSummary.md) |  | 
**VersionGroups** | [**VersionGroupSummary[]**](VersionGroupSummary.md) |  | 

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

