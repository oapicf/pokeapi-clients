# PokemonColorDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Names** | [**PokemonColorName[]**](PokemonColorName.md) |  | 
**PokemonSpecies** | [**PokemonSpeciesSummary[]**](PokemonSpeciesSummary.md) |  | 

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

