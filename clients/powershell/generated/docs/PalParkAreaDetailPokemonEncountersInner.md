# PalParkAreaDetailPokemonEncountersInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BaseScore** | **Int32** |  | 
**PokemonSpecies** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**Rate** | **Int32** |  | 

## Examples

- Prepare the resource
```powershell
$PalParkAreaDetailPokemonEncountersInner = Initialize-PSOpenAPIToolsPalParkAreaDetailPokemonEncountersInner  -BaseScore null `
 -PokemonSpecies null `
 -Rate null
```

- Convert the resource to JSON
```powershell
$PalParkAreaDetailPokemonEncountersInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

