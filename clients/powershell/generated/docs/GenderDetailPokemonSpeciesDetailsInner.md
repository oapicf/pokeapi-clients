# GenderDetailPokemonSpeciesDetailsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Rate** | **Int32** |  | 
**PokemonSpecies** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$GenderDetailPokemonSpeciesDetailsInner = Initialize-PSOpenAPIToolsGenderDetailPokemonSpeciesDetailsInner  -Rate null `
 -PokemonSpecies null
```

- Convert the resource to JSON
```powershell
$GenderDetailPokemonSpeciesDetailsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

