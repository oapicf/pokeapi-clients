# PokemonSpeciesPalParkEncounter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BaseScore** | **Int32** | The base score given to the player when the referenced Pokémon is caught during a pal park run. | [optional] 
**Rate** | **Int32** | The base rate for encountering the referenced Pokémon in this pal park area. | 
**Area** | [**PalParkAreaSummary**](PalParkAreaSummary.md) | The pal park area where this encounter happens. | 

## Examples

- Prepare the resource
```powershell
$PokemonSpeciesPalParkEncounter = Initialize-PSOpenAPIToolsPokemonSpeciesPalParkEncounter  -BaseScore null `
 -Rate null `
 -Area null
```

- Convert the resource to JSON
```powershell
$PokemonSpeciesPalParkEncounter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

