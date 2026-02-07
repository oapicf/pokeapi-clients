# PokemonStat
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BaseStat** | **Int32** |  | 
**Effort** | **Int32** |  | 
**Stat** | [**StatSummary**](StatSummary.md) |  | 

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

