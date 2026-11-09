# PokemonPastStat
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced pokémon had the listed stats. | 
**Stats** | [**PokemonStat[]**](PokemonStat.md) | The stat the Pokémon had up to and including the listed generation. | 

## Examples

- Prepare the resource
```powershell
$PokemonPastStat = Initialize-PSOpenAPIToolsPokemonPastStat  -Generation null `
 -Stats null
```

- Convert the resource to JSON
```powershell
$PokemonPastStat | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

