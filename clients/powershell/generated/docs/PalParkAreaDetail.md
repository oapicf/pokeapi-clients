# PalParkAreaDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Names** | [**PalParkAreaName[]**](PalParkAreaName.md) |  | 
**PokemonEncounters** | [**PalParkAreaDetailPokemonEncountersInner[]**](PalParkAreaDetailPokemonEncountersInner.md) |  | 

## Examples

- Prepare the resource
```powershell
$PalParkAreaDetail = Initialize-PSOpenAPIToolsPalParkAreaDetail  -Id null `
 -Name null `
 -Names null `
 -PokemonEncounters null
```

- Convert the resource to JSON
```powershell
$PalParkAreaDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

