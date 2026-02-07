# GrowthRateDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Formula** | **String** |  | 
**Descriptions** | [**GrowthRateDescription[]**](GrowthRateDescription.md) |  | 
**Levels** | [**Experience[]**](Experience.md) |  | 
**PokemonSpecies** | [**PokemonSpeciesSummary[]**](PokemonSpeciesSummary.md) |  | 

## Examples

- Prepare the resource
```powershell
$GrowthRateDetail = Initialize-PSOpenAPIToolsGrowthRateDetail  -Id null `
 -Name null `
 -Formula null `
 -Descriptions null `
 -Levels null `
 -PokemonSpecies null
```

- Convert the resource to JSON
```powershell
$GrowthRateDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

