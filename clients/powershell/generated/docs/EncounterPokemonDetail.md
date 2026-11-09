# EncounterPokemonDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MinPerfectIvs** | **Int32** | The minimum number of perfect IVs, or null if unspecified. | [optional] 
**AlwaysShiny** | **Boolean** | Whether the encountered Pokémon is always shiny. | [optional] 
**NeverShiny** | **Boolean** | Whether the encountered Pokémon can never be shiny. | [optional] 
**IsAlpha** | **Boolean** | Whether the encountered Pokémon is an alpha Pokémon. | [optional] 

## Examples

- Prepare the resource
```powershell
$EncounterPokemonDetail = Initialize-PSOpenAPIToolsEncounterPokemonDetail  -MinPerfectIvs null `
 -AlwaysShiny null `
 -NeverShiny null `
 -IsAlpha null
```

- Convert the resource to JSON
```powershell
$EncounterPokemonDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

