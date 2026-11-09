# openapi::EvolutionVariableDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**symbol** | **character** | The symbol used for this variable in evolution condition expressions. | [Max. length: 10] 
**data_type** | **character** | The data type of this variable. | [optional] [Max. length: 20] 
**source** | **character** | The source of the variable value. | [optional] [Max. length: 20] 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which this variable was introduced. | 
**names** | [**array[EvolutionVariableName]**](EvolutionVariableName.md) | The name of this resource listed in different languages. | [readonly] 
**descriptions** | [**array[EvolutionVariableDescription]**](EvolutionVariableDescription.md) | The description of this resource listed in different languages. | [readonly] 


