# MoveStatChange
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Change** | **Int32** | The maximum amount of change to the referenced stat. | 
**Move** | [**MoveSummary**](MoveSummary.md) | The move causing the change. | 

## Examples

- Prepare the resource
```powershell
$MoveStatChange = Initialize-PSOpenAPIToolsMoveStatChange  -Change null `
 -Move null
```

- Convert the resource to JSON
```powershell
$MoveStatChange | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

