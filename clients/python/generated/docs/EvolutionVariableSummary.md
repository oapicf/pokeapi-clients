# EvolutionVariableSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the referenced resource. | 
**url** | **str** | The URL of the referenced resource. | [readonly] 

## Example

```python
from pokeapiclient.models.evolution_variable_summary import EvolutionVariableSummary

# TODO update the JSON string below
json = "{}"
# create an instance of EvolutionVariableSummary from a JSON string
evolution_variable_summary_instance = EvolutionVariableSummary.from_json(json)
# print the JSON string representation of the object
print(EvolutionVariableSummary.to_json())

# convert the object into a dict
evolution_variable_summary_dict = evolution_variable_summary_instance.to_dict()
# create an instance of EvolutionVariableSummary from a dict
evolution_variable_summary_from_dict = EvolutionVariableSummary.from_dict(evolution_variable_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


