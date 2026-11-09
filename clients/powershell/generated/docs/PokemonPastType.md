# PokemonPastType
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced pokémon had the listed types. | 
**Types** | [**PokemonType[]**](PokemonType.md) | The types the referenced pokémon had up to and including the listed generation. | 

## Examples

- Prepare the resource
```powershell
$PokemonPastType = Initialize-PSOpenAPIToolsPokemonPastType  -Generation null `
 -Types null
```

- Convert the resource to JSON
```powershell
$PokemonPastType | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

