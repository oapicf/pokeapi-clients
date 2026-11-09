# EvolutionVariableDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Symbol** | **String** | The symbol used for this variable in evolution condition expressions. | 
**DataType** | **String** | The data type of this variable. | [optional] 
**Source** | **String** | The source of the variable value. | [optional] 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which this variable was introduced. | 
**Names** | [**EvolutionVariableName[]**](EvolutionVariableName.md) | The name of this resource listed in different languages. | [readonly] 
**Descriptions** | [**EvolutionVariableDescription[]**](EvolutionVariableDescription.md) | The description of this resource listed in different languages. | [readonly] 

## Examples

- Prepare the resource
```powershell
$EvolutionVariableDetail = Initialize-PSOpenAPIToolsEvolutionVariableDetail  -Id null `
 -Name null `
 -Symbol null `
 -DataType null `
 -Source null `
 -VersionGroup null `
 -Names null `
 -Descriptions null
```

- Convert the resource to JSON
```powershell
$EvolutionVariableDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

