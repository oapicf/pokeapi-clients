# EvolutionVariableDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**symbol** | **str** | The symbol used for this variable in evolution condition expressions. | 
**data_type** | **str** | The data type of this variable. | [optional] 
**source** | **str** | The source of the variable value. | [optional] 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which this variable was introduced. | 
**names** | [**List[EvolutionVariableName]**](EvolutionVariableName.md) | The name of this resource listed in different languages. | [readonly] 
**descriptions** | [**List[EvolutionVariableDescription]**](EvolutionVariableDescription.md) | The description of this resource listed in different languages. | [readonly] 

## Example

```python
from pokeapiclient.models.evolution_variable_detail import EvolutionVariableDetail

# TODO update the JSON string below
json = "{}"
# create an instance of EvolutionVariableDetail from a JSON string
evolution_variable_detail_instance = EvolutionVariableDetail.from_json(json)
# print the JSON string representation of the object
print(EvolutionVariableDetail.to_json())

# convert the object into a dict
evolution_variable_detail_dict = evolution_variable_detail_instance.to_dict()
# create an instance of EvolutionVariableDetail from a dict
evolution_variable_detail_from_dict = EvolutionVariableDetail.from_dict(evolution_variable_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


