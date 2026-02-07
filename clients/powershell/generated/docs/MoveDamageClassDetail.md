# MoveDamageClassDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Descriptions** | [**MoveDamageClassDescription[]**](MoveDamageClassDescription.md) |  | 
**Moves** | [**MoveSummary[]**](MoveSummary.md) |  | 
**Names** | [**MoveDamageClassName[]**](MoveDamageClassName.md) |  | 

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

