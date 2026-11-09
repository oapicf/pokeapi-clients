# PokedexDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**IsMainSeries** | **Boolean** | Whether or not this Pokédex originated in the main series of the video games. | [optional] 
**Descriptions** | [**PokedexDescription[]**](PokedexDescription.md) | The description of this resource listed in different languages. | [readonly] 
**Names** | [**PokedexName[]**](PokedexName.md) | The name of this resource listed in different languages. | [readonly] 
**PokemonEntries** | [**PokemonDexNumber[]**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. | [readonly] 
**Region** | [**RegionSummary**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. | 
**VersionGroups** | [**VersionGroupSummary[]**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. | [readonly] 

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

