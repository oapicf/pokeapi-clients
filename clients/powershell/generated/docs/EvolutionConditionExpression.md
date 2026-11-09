# EvolutionConditionExpression
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Expression** | **String** | Evaluatable RPN condition expression using evolution variables (e.g. &#39;EC 100 % 0 &#x3D;&#x3D;&#39;) | 
**PercentageChance** | **Double** | Percentage chance of evolution under this condition (0-100) | 
**Variables** | [**EvolutionVariableSummary[]**](EvolutionVariableSummary.md) | Evolution variables referenced in the expression | 

## Examples

- Prepare the resource
```powershell
$EvolutionConditionExpression = Initialize-PSOpenAPIToolsEvolutionConditionExpression  -Expression null `
 -PercentageChance null `
 -Variables null
```

- Convert the resource to JSON
```powershell
$EvolutionConditionExpression | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

