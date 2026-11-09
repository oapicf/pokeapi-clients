# MoveChange
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Accuracy** | **Int32** | The percent value of how likely this move is to be successful. | [optional] 
**Power** | **Int32** | The base power before the listed version group, or null if power did not change. | [optional] 
**Pp** | **Int32** | Power points. The number of times this move can be used. | [optional] 
**EffectChance** | **Int32** | The percent value of how likely it is this moves effect will take effect. | 
**EffectEntries** | [**MoveEffectEffectText[]**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] 
**Type** | [**TypeSummary**](TypeSummary.md) | The elemental type of this move. | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which these move stat values were in effect. | 

## Examples

- Prepare the resource
```powershell
$MoveChange = Initialize-PSOpenAPIToolsMoveChange  -Accuracy null `
 -Power null `
 -Pp null `
 -EffectChance null `
 -EffectEntries null `
 -Type null `
 -VersionGroup null
```

- Convert the resource to JSON
```powershell
$MoveChange | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

