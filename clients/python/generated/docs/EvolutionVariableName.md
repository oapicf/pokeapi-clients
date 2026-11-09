# EvolutionVariableName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The localized name for an API resource in a specific language. | 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 

## Example

```python
from pokeapiclient.models.evolution_variable_name import EvolutionVariableName

# TODO update the JSON string below
json = "{}"
# create an instance of EvolutionVariableName from a JSON string
evolution_variable_name_instance = EvolutionVariableName.from_json(json)
# print the JSON string representation of the object
print(EvolutionVariableName.to_json())

# convert the object into a dict
evolution_variable_name_dict = evolution_variable_name_instance.to_dict()
# create an instance of EvolutionVariableName from a dict
evolution_variable_name_from_dict = EvolutionVariableName.from_dict(evolution_variable_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


