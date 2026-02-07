# PokemonShapeDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**AwesomeNames** | [**PokemonShapeDetailAwesomeNamesInner[]**](PokemonShapeDetailAwesomeNamesInner.md) |  | 
**Names** | [**PokemonShapeDetailNamesInner[]**](PokemonShapeDetailNamesInner.md) |  | 
**PokemonSpecies** | [**PokemonSpeciesSummary[]**](PokemonSpeciesSummary.md) |  | 

## Examples

- Prepare the resource
```powershell
$PokemonShapeDetail = Initialize-PSOpenAPIToolsPokemonShapeDetail  -Id null `
 -Name null `
 -AwesomeNames null `
 -Names null `
 -PokemonSpecies null
```

- Convert the resource to JSON
```powershell
$PokemonShapeDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

