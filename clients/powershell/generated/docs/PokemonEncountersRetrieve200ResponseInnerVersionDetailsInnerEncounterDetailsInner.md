# PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Chance** | **Decimal** |  | 
**ConditionValues** | [**PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner[]**](PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner.md) |  | 
**MaxLevel** | **Decimal** |  | 
**Method** | [**PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod**](PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod.md) |  | 
**MinLevel** | **Decimal** |  | 

## Examples

- Prepare the resource
```powershell
$PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner = Initialize-PSOpenAPIToolsPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner  -Chance 100 `
 -ConditionValues null `
 -MaxLevel 10 `
 -Method null `
 -MinLevel 10
```

- Convert the resource to JSON
```powershell
$PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

