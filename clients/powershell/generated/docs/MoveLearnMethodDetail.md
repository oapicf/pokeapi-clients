# MoveLearnMethodDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Names** | [**MoveLearnMethodName[]**](MoveLearnMethodName.md) | The name of this resource listed in different languages. | [readonly] 
**Descriptions** | [**MoveLearnMethodDescription[]**](MoveLearnMethodDescription.md) | The description of this resource listed in different languages. | [readonly] 
**VersionGroups** | [**VersionGroupSummary[]**](VersionGroupSummary.md) | A list of version groups where moves can be learned through this method. | [readonly] 

## Examples

- Prepare the resource
```powershell
$MoveLearnMethodDetail = Initialize-PSOpenAPIToolsMoveLearnMethodDetail  -Id null `
 -Name null `
 -Names null `
 -Descriptions null `
 -VersionGroups null
```

- Convert the resource to JSON
```powershell
$MoveLearnMethodDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

