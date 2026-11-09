# PokemonSpeciesVariety
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsDefault** | **Boolean** | Whether this variety is the default variety. | 
**Pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon variety. | 

## Examples

- Prepare the resource
```powershell
$PokemonSpeciesVariety = Initialize-PSOpenAPIToolsPokemonSpeciesVariety  -IsDefault null `
 -Pokemon null
```

- Convert the resource to JSON
```powershell
$PokemonSpeciesVariety | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

