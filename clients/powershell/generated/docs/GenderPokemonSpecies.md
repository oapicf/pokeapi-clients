# GenderPokemonSpecies
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Rate** | **Int32** | The chance of this Pokémon being female, in eighths; or -1 for genderless. | 
**PokemonSpecies** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | A Pokémon species that can be the referenced gender. | 

## Examples

- Prepare the resource
```powershell
$GenderPokemonSpecies = Initialize-PSOpenAPIToolsGenderPokemonSpecies  -Rate null `
 -PokemonSpecies null
```

- Convert the resource to JSON
```powershell
$GenderPokemonSpecies | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

