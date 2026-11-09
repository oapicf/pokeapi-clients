# EggGroupDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Names** | [**EggGroupName[]**](EggGroupName.md) | The name of this resource listed in different languages. | [readonly] 
**PokemonSpecies** | [**PokemonSpeciesSummary[]**](PokemonSpeciesSummary.md) | A list of all Pokémon species that are members of this egg group. | [readonly] 

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

