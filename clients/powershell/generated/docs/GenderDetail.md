# GenderDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**PokemonSpeciesDetails** | [**GenderDetailPokemonSpeciesDetailsInner[]**](GenderDetailPokemonSpeciesDetailsInner.md) |  | 
**RequiredForEvolution** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 

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

