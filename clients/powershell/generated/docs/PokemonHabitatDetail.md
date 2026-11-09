# PokemonHabitatDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Names** | [**PokemonHabitatName[]**](PokemonHabitatName.md) | The name of this resource listed in different languages. | [readonly] 
**PokemonSpecies** | [**PokemonSpeciesSummary[]**](PokemonSpeciesSummary.md) | A list of the Pokémon species that can be found in this habitat. | [readonly] 

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

