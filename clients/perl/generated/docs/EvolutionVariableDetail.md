# WWW::OpenAPIClient::Object::EvolutionVariableDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::EvolutionVariableDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**symbol** | **string** | The symbol used for this variable in evolution condition expressions. | 
**data_type** | **string** | The data type of this variable. | [optional] 
**source** | **string** | The source of the variable value. | [optional] 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which this variable was introduced. | 
**names** | [**ARRAY[EvolutionVariableName]**](EvolutionVariableName.md) | The name of this resource listed in different languages. | [readonly] 
**descriptions** | [**ARRAY[EvolutionVariableDescription]**](EvolutionVariableDescription.md) | The description of this resource listed in different languages. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


