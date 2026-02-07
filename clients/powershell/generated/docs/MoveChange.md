# MoveChange
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Accuracy** | **Int32** |  | [optional] 
**Power** | **Int32** |  | [optional] 
**Pp** | **Int32** |  | [optional] 
**EffectChance** | **Int32** |  | 
**EffectEntries** | [**MoveChangeEffectEntriesInner[]**](MoveChangeEffectEntriesInner.md) |  | 
**Type** | [**TypeSummary**](TypeSummary.md) |  | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 

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

