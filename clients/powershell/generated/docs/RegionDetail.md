# RegionDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Locations** | [**LocationSummary[]**](LocationSummary.md) |  | [readonly] 
**MainGeneration** | [**GenerationSummary**](GenerationSummary.md) |  | [readonly] 
**Names** | [**RegionName[]**](RegionName.md) |  | [readonly] 
**Pokedexes** | [**PokedexSummary[]**](PokedexSummary.md) |  | [readonly] 
**VersionGroups** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] 

## Examples

- Prepare the resource
```powershell
$RegionDetail = Initialize-PSOpenAPIToolsRegionDetail  -Id null `
 -Name null `
 -Locations null `
 -MainGeneration null `
 -Names null `
 -Pokedexes null `
 -VersionGroups null
```

- Convert the resource to JSON
```powershell
$RegionDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

