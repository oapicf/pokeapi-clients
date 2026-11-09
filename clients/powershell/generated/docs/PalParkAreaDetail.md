# PalParkAreaDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Names** | [**PalParkAreaName[]**](PalParkAreaName.md) | The name of this resource listed in different languages. | [readonly] 
**PokemonEncounters** | [**PalParkEncounter[]**](PalParkEncounter.md) | A list of Pokémon encountered in thi pal park area along with details. | [readonly] 

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

