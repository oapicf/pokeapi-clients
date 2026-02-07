# LocationAreaDetailEncounterMethodRatesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EncounterMethod** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**VersionDetails** | [**LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner[]**](LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner.md) |  | 

## Examples

- Prepare the resource
```powershell
$LocationAreaDetailEncounterMethodRatesInner = Initialize-PSOpenAPIToolsLocationAreaDetailEncounterMethodRatesInner  -EncounterMethod null `
 -VersionDetails null
```

- Convert the resource to JSON
```powershell
$LocationAreaDetailEncounterMethodRatesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

