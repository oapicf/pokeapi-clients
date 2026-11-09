# GrowthRateDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Formula** | **String** | The formula used to calculate the rate at which the Pokémon species gains level. | 
**Descriptions** | [**GrowthRateDescription[]**](GrowthRateDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] 
**Levels** | [**Experience[]**](Experience.md) | A list of levels and the amount of experienced needed to atain them based on this growth rate. | [readonly] 
**PokemonSpecies** | [**PokemonSpeciesSummary[]**](PokemonSpeciesSummary.md) | A list of Pokémon species that gain levels at this growth rate. | [readonly] 

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

