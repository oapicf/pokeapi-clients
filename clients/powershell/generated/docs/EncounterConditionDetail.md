# EncounterConditionDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Values** | [**EncounterConditionValueSummary[]**](EncounterConditionValueSummary.md) |  | 
**Names** | [**EncounterConditionName[]**](EncounterConditionName.md) |  | 

## Examples

- Prepare the resource
```powershell
$EncounterConditionDetail = Initialize-PSOpenAPIToolsEncounterConditionDetail  -Id null `
 -Name null `
 -Values null `
 -Names null
```

- Convert the resource to JSON
```powershell
$EncounterConditionDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

