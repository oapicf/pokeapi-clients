# PokemonFormTriggerCondition
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Trigger** | **String** | The trigger for this form change. | 
**Name** | **String** | The name of the required item, ability, or move. Only present for a resource-based trigger. | [optional] 
**Url** | **String** | The URL of the required item, ability, or move. Only present for a resource-based trigger. | [optional] 
**BaseForm** | [**PokemonFormSummary**](PokemonFormSummary.md) | The required base form. Only present when the trigger specifies one. | [optional] 

## Examples

- Prepare the resource
```powershell
$PokemonFormTriggerCondition = Initialize-PSOpenAPIToolsPokemonFormTriggerCondition  -Trigger null `
 -Name null `
 -Url null `
 -BaseForm null
```

- Convert the resource to JSON
```powershell
$PokemonFormTriggerCondition | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

