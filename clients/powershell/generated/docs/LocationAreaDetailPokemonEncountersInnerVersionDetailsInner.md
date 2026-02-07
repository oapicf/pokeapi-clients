# LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Version** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**MaxChance** | **Int32** |  | 
**EncounterDetails** | [**LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails**](LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.md) |  | 

## Examples

- Prepare the resource
```powershell
$LocationAreaDetailPokemonEncountersInnerVersionDetailsInner = Initialize-PSOpenAPIToolsLocationAreaDetailPokemonEncountersInnerVersionDetailsInner  -Version null `
 -MaxChance null `
 -EncounterDetails null
```

- Convert the resource to JSON
```powershell
$LocationAreaDetailPokemonEncountersInnerVersionDetailsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

