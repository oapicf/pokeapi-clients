# MoveBattleStyleDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Names** | [**MoveBattleStyleName[]**](MoveBattleStyleName.md) |  | 

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

