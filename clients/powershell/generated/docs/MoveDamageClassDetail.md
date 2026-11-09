# MoveDamageClassDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Descriptions** | [**MoveDamageClassDescription[]**](MoveDamageClassDescription.md) | The description of this resource listed in different languages. | [readonly] 
**Moves** | [**MoveSummary[]**](MoveSummary.md) | A list of moves that fall into this damage class. | [readonly] 
**Names** | [**MoveDamageClassName[]**](MoveDamageClassName.md) | The name of this resource listed in different languages. | [readonly] 

## Examples

- Prepare the resource
```powershell
$MoveDamageClassDetail = Initialize-PSOpenAPIToolsMoveDamageClassDetail  -Id null `
 -Name null `
 -Descriptions null `
 -Moves null `
 -Names null
```

- Convert the resource to JSON
```powershell
$MoveDamageClassDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

