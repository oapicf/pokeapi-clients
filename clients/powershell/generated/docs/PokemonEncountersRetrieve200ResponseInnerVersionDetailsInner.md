# PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EncounterDetails** | [**PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner[]**](PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.md) |  | 
**MaxChance** | **Decimal** |  | 
**Version** | [**PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion**](PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion.md) |  | 

## Examples

- Prepare the resource
```powershell
$PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner = Initialize-PSOpenAPIToolsPokemonEncountersRetrieve200ResponseInnerVersionDetailsInner  -EncounterDetails null `
 -MaxChance 100 `
 -Version null
```

- Convert the resource to JSON
```powershell
$PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

