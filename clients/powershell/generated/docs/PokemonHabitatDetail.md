# PokemonHabitatDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Names** | [**PokemonHabitatName[]**](PokemonHabitatName.md) |  | 
**PokemonSpecies** | [**PokemonSpeciesSummary[]**](PokemonSpeciesSummary.md) |  | 

## Examples

- Prepare the resource
```powershell
$PokemonHabitatDetail = Initialize-PSOpenAPIToolsPokemonHabitatDetail  -Id null `
 -Name null `
 -Names null `
 -PokemonSpecies null
```

- Convert the resource to JSON
```powershell
$PokemonHabitatDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

