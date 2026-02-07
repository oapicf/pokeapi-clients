# PokemonSpeciesDetailVarietiesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsDefault** | **Boolean** |  | 
**Pokemon** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$PokemonSpeciesDetailVarietiesInner = Initialize-PSOpenAPIToolsPokemonSpeciesDetailVarietiesInner  -IsDefault null `
 -Pokemon null
```

- Convert the resource to JSON
```powershell
$PokemonSpeciesDetailVarietiesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

