# LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MinLevel** | **Int32** |  | 
**MaxLevel** | **Int32** |  | 
**ConditionValues** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | [optional] 
**Chance** | **Int32** |  | 
**Method** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails = Initialize-PSOpenAPIToolsLocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails  -MinLevel null `
 -MaxLevel null `
 -ConditionValues null `
 -Chance null `
 -Method null
```

- Convert the resource to JSON
```powershell
$LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

