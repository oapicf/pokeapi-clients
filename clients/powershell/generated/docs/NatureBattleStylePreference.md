# NatureBattleStylePreference
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LowHpPreference** | **Int32** | Chance of using the move, in percent, if HP is under one half. | 
**HighHpPreference** | **Int32** | Chance of using the move, in percent, if HP is over one half. | 
**MoveBattleStyle** | [**MoveBattleStyleSummary**](MoveBattleStyleSummary.md) | The move battle style. | 

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

