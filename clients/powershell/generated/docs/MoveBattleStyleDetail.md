# MoveBattleStyleDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Names** | [**MoveBattleStyleName[]**](MoveBattleStyleName.md) | The name of this resource listed in different languages. | [readonly] 

## Examples

- Prepare the resource
```powershell
$MoveBattleStyleDetail = Initialize-PSOpenAPIToolsMoveBattleStyleDetail  -Id null `
 -Name null `
 -Names null
```

- Convert the resource to JSON
```powershell
$MoveBattleStyleDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

