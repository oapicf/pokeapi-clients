# MoveMetaStatChange
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Change** | **Int32** | The amount of change. | 
**Stat** | [**StatSummary**](StatSummary.md) | The stat being affected. | 

## Examples

- Prepare the resource
```powershell
$MoveMetaStatChange = Initialize-PSOpenAPIToolsMoveMetaStatChange  -Change null `
 -Stat null
```

- Convert the resource to JSON
```powershell
$MoveMetaStatChange | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

