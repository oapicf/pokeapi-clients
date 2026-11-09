# PokemonColorDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Names** | [**PokemonColorName[]**](PokemonColorName.md) | The name of this resource listed in different languages. | [readonly] 
**PokemonSpecies** | [**PokemonSpeciesSummary[]**](PokemonSpeciesSummary.md) | A list of the Pokémon species that have this color. | [readonly] 

## Examples

- Prepare the resource
```powershell
$PokemonColorDetail = Initialize-PSOpenAPIToolsPokemonColorDetail  -Id null `
 -Name null `
 -Names null `
 -PokemonSpecies null
```

- Convert the resource to JSON
```powershell
$PokemonColorDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

