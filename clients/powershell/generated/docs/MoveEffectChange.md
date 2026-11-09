# MoveEffectChange
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which the previous effect of this ability originated. | 
**EffectEntries** | [**MoveEffectChangeEffectText[]**](MoveEffectChangeEffectText.md) | The previous effect of this ability listed in different languages. | [readonly] 

## Examples

- Prepare the resource
```powershell
$MoveEffectChange = Initialize-PSOpenAPIToolsMoveEffectChange  -VersionGroup null `
 -EffectEntries null
```

- Convert the resource to JSON
```powershell
$MoveEffectChange | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

