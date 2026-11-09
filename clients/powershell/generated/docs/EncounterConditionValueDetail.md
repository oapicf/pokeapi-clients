# EncounterConditionValueDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Condition** | [**EncounterConditionSummary**](EncounterConditionSummary.md) | The condition this encounter condition value pertains to. | 
**Names** | [**EncounterConditionValueName[]**](EncounterConditionValueName.md) | The name of this resource listed in different languages. | [readonly] 

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

