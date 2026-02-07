# StatDetailAffectingMoves
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Increase** | [**StatDetailAffectingMovesIncreaseInner[]**](StatDetailAffectingMovesIncreaseInner.md) |  | 
**Decrease** | [**StatDetailAffectingMovesIncreaseInner[]**](StatDetailAffectingMovesIncreaseInner.md) |  | 

## Examples

- Prepare the resource
```powershell
$StatDetailAffectingMoves = Initialize-PSOpenAPIToolsStatDetailAffectingMoves  -Increase null `
 -Decrease null
```

- Convert the resource to JSON
```powershell
$StatDetailAffectingMoves | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

