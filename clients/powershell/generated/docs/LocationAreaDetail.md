# LocationAreaDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**GameIndex** | **Int32** |  | 
**EncounterMethodRates** | [**LocationAreaDetailEncounterMethodRatesInner[]**](LocationAreaDetailEncounterMethodRatesInner.md) |  | [readonly] 
**Location** | [**LocationSummary**](LocationSummary.md) |  | 
**Names** | [**LocationAreaName[]**](LocationAreaName.md) |  | [readonly] 
**PokemonEncounters** | [**LocationAreaDetailPokemonEncountersInner[]**](LocationAreaDetailPokemonEncountersInner.md) |  | [readonly] 

## Examples

- Prepare the resource
```powershell
$LocationAreaDetail = Initialize-PSOpenAPIToolsLocationAreaDetail  -Id null `
 -Name null `
 -GameIndex null `
 -EncounterMethodRates null `
 -Location null `
 -Names null `
 -PokemonEncounters null
```

- Convert the resource to JSON
```powershell
$LocationAreaDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

