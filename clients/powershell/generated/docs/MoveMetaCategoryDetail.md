# MoveMetaCategoryDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Descriptions** | [**MoveMetaCategoryDescription[]**](MoveMetaCategoryDescription.md) | The description of this resource listed in different languages. | [readonly] 
**Moves** | [**MoveSummary[]**](MoveSummary.md) | A list of moves that fall into this category. | [readonly] 

## Examples

- Prepare the resource
```powershell
$MoveMetaCategoryDetail = Initialize-PSOpenAPIToolsMoveMetaCategoryDetail  -Id null `
 -Name null `
 -Descriptions null `
 -Moves null
```

- Convert the resource to JSON
```powershell
$MoveMetaCategoryDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

