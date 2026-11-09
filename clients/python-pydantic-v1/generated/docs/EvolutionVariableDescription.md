# EvolutionVariableDescription


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | The localized description for an API resource in a specific language. | [optional] 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 

## Example

```python
from openapi_client.models.evolution_variable_description import EvolutionVariableDescription

# TODO update the JSON string below
json = "{}"
# create an instance of EvolutionVariableDescription from a JSON string
evolution_variable_description_instance = EvolutionVariableDescription.from_json(json)
# print the JSON string representation of the object
print EvolutionVariableDescription.to_json()

# convert the object into a dict
evolution_variable_description_dict = evolution_variable_description_instance.to_dict()
# create an instance of EvolutionVariableDescription from a dict
evolution_variable_description_from_dict = EvolutionVariableDescription.from_dict(evolution_variable_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


