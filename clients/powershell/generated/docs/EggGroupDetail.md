# EggGroupDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Names** | [**EggGroupName[]**](EggGroupName.md) |  | 
**PokemonSpecies** | [**EggGroupDetailPokemonSpeciesInner[]**](EggGroupDetailPokemonSpeciesInner.md) |  | 

## Examples

- Prepare the resource
```powershell
$EggGroupDetail = Initialize-PSOpenAPIToolsEggGroupDetail  -Id null `
 -Name null `
 -Names null `
 -PokemonSpecies null
```

- Convert the resource to JSON
```powershell
$EggGroupDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

