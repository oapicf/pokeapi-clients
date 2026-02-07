# PokedexDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**IsMainSeries** | **Boolean** |  | [optional] 
**Descriptions** | [**PokedexDescription[]**](PokedexDescription.md) |  | 
**Names** | [**PokedexName[]**](PokedexName.md) |  | 
**PokemonEntries** | [**PokedexDetailPokemonEntriesInner[]**](PokedexDetailPokemonEntriesInner.md) |  | 
**Region** | [**RegionSummary**](RegionSummary.md) |  | 
**VersionGroups** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$PokedexDetail = Initialize-PSOpenAPIToolsPokedexDetail  -Id null `
 -Name null `
 -IsMainSeries null `
 -Descriptions null `
 -Names null `
 -PokemonEntries null `
 -Region null `
 -VersionGroups null
```

- Convert the resource to JSON
```powershell
$PokedexDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

