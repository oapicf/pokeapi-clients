# EvolutionVariableDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**symbol** | **String** | The symbol used for this variable in evolution condition expressions. | 
**data_type** | **String** | The data type of this variable. | [optional] [default to None]
**source** | **String** | The source of the variable value. | [optional] [default to None]
**version_group** | [***models::VersionGroupSummary**](VersionGroupSummary.md) | The version group in which this variable was introduced. | 
**names** | [**Vec<models::EvolutionVariableName>**](EvolutionVariableName.md) | The name of this resource listed in different languages. | [readonly] 
**descriptions** | [**Vec<models::EvolutionVariableDescription>**](EvolutionVariableDescription.md) | The description of this resource listed in different languages. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


