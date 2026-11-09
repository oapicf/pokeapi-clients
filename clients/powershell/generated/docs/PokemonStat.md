# PokemonStat
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BaseStat** | **Int32** | The base value of the stat. | 
**Effort** | **Int32** | The effort points (EV) the Pokémon has in the stat. | 
**Stat** | [**StatSummary**](StatSummary.md) | The stat the Pokémon has. | 

## Examples

- Prepare the resource
```powershell
$PokemonStat = Initialize-PSOpenAPIToolsPokemonStat  -BaseStat null `
 -Effort null `
 -Stat null
```

- Convert the resource to JSON
```powershell
$PokemonStat | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

