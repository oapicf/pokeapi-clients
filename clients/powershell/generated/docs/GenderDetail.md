# GenderDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**PokemonSpeciesDetails** | [**GenderPokemonSpecies[]**](GenderPokemonSpecies.md) | A list of Pokémon species that can be this gender and how likely it is that they will be. | [readonly] 
**RequiredForEvolution** | [**PokemonSpeciesSummary[]**](PokemonSpeciesSummary.md) | A list of Pokémon species that required this gender in order for a Pokémon to evolve into them. | [readonly] 

## Examples

- Prepare the resource
```powershell
$GenderDetail = Initialize-PSOpenAPIToolsGenderDetail  -Id null `
 -Name null `
 -PokemonSpeciesDetails null `
 -RequiredForEvolution null
```

- Convert the resource to JSON
```powershell
$GenderDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

