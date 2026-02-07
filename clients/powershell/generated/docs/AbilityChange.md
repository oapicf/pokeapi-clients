# AbilityChange
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 
**EffectEntries** | [**AbilityChangeEffectText[]**](AbilityChangeEffectText.md) |  | 

## Examples

- Prepare the resource
```powershell
$AbilityChange = Initialize-PSOpenAPIToolsAbilityChange  -VersionGroup null `
 -EffectEntries null
```

- Convert the resource to JSON
```powershell
$AbilityChange | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

