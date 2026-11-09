# PokemonEncounterDetailResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Chance** | **Int32** | Percent chance that this encounter will occur. | 
**ConditionValues** | [**EncounterConditionValueSummary[]**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | 
**MaxLevel** | **Int32** | The highest level the Pokémon could be encountered at. | 
**Method** | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method by which this encounter happens. | 
**MinLevel** | **Int32** | The lowest level the Pokémon could be encountered at. | 

## Examples

- Prepare the resource
```powershell
$PokemonEncounterDetailResponse = Initialize-PSOpenAPIToolsPokemonEncounterDetailResponse  -Chance null `
 -ConditionValues null `
 -MaxLevel null `
 -Method null `
 -MinLevel null
```

- Convert the resource to JSON
```powershell
$PokemonEncounterDetailResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

