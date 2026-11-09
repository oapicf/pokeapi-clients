# EncounterConditionDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Values** | [**EncounterConditionValueSummary[]**](EncounterConditionValueSummary.md) | A list of possible values for this encounter condition. | [readonly] 
**Names** | [**EncounterConditionName[]**](EncounterConditionName.md) | The name of this resource listed in different languages. | [readonly] 

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

