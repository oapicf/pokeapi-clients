# NaturePokeathlonStat
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MaxChange** | **Int32** | The amount of change. | 
**PokeathlonStat** | [**PokeathlonStatSummary**](PokeathlonStatSummary.md) | The stat being affected. | 

## Examples

- Prepare the resource
```powershell
$NaturePokeathlonStat = Initialize-PSOpenAPIToolsNaturePokeathlonStat  -MaxChange null `
 -PokeathlonStat null
```

- Convert the resource to JSON
```powershell
$NaturePokeathlonStat | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

