# MoveMetaAilmentDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Moves** | [**MoveSummary[]**](MoveSummary.md) | A list of moves that cause this ailment. | [readonly] 
**Names** | [**MoveMetaAilmentName[]**](MoveMetaAilmentName.md) | The name of this resource listed in different languages. | [readonly] 

## Examples

- Prepare the resource
```powershell
$MoveMetaAilmentDetail = Initialize-PSOpenAPIToolsMoveMetaAilmentDetail  -Id null `
 -Name null `
 -Moves null `
 -Names null
```

- Convert the resource to JSON
```powershell
$MoveMetaAilmentDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

