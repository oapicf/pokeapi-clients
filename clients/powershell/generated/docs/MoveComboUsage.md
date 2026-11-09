# MoveComboUsage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UseBefore** | [**MoveSummary[]**](MoveSummary.md) | A list of moves to use before this move. | 
**UseAfter** | [**MoveSummary[]**](MoveSummary.md) | A list of moves to use after this move. | 

## Examples

- Prepare the resource
```powershell
$MoveComboUsage = Initialize-PSOpenAPIToolsMoveComboUsage  -UseBefore null `
 -UseAfter null
```

- Convert the resource to JSON
```powershell
$MoveComboUsage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

