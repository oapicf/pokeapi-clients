# PalParkEncounter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BaseScore** | **Int32** | The base score given to the player when this Pokémon is caught during a pal park run. | [optional] 
**Rate** | **Int32** | The base rate for encountering this Pokémon in this pal park area. | 
**PokemonSpecies** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species being encountered. | 

## Examples

- Prepare the resource
```powershell
$PalParkEncounter = Initialize-PSOpenAPIToolsPalParkEncounter  -BaseScore null `
 -Rate null `
 -PokemonSpecies null
```

- Convert the resource to JSON
```powershell
$PalParkEncounter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

