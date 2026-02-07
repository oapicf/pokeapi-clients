# NatureBattleStylePreference
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LowHpPreference** | **Int32** |  | 
**HighHpPreference** | **Int32** |  | 
**MoveBattleStyle** | [**MoveBattleStyleSummary**](MoveBattleStyleSummary.md) |  | 

## Examples

- Prepare the resource
```powershell
$NatureBattleStylePreference = Initialize-PSOpenAPIToolsNatureBattleStylePreference  -LowHpPreference null `
 -HighHpPreference null `
 -MoveBattleStyle null
```

- Convert the resource to JSON
```powershell
$NatureBattleStylePreference | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

