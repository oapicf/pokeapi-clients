# EncounterConditionValueDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Condition** | [**EncounterConditionSummary**](EncounterConditionSummary.md) |  | 
**Names** | [**EncounterConditionValueName[]**](EncounterConditionValueName.md) |  | 

## Examples

- Prepare the resource
```powershell
$EncounterConditionValueDetail = Initialize-PSOpenAPIToolsEncounterConditionValueDetail  -Id null `
 -Name null `
 -Condition null `
 -Names null
```

- Convert the resource to JSON
```powershell
$EncounterConditionValueDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

