# StatAffectingMoves
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Increase** | [**MoveStatChange[]**](MoveStatChange.md) | A list of moves and how they change the referenced stat. | 
**Decrease** | [**MoveStatChange[]**](MoveStatChange.md) | A list of moves and how they change the referenced stat. | 

## Examples

- Prepare the resource
```powershell
$StatAffectingMoves = Initialize-PSOpenAPIToolsStatAffectingMoves  -Increase null `
 -Decrease null
```

- Convert the resource to JSON
```powershell
$StatAffectingMoves | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

