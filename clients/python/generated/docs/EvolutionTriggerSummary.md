# EvolutionTriggerSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.evolution_trigger_summary import EvolutionTriggerSummary

# TODO update the JSON string below
json = "{}"
# create an instance of EvolutionTriggerSummary from a JSON string
evolution_trigger_summary_instance = EvolutionTriggerSummary.from_json(json)
# print the JSON string representation of the object
print(EvolutionTriggerSummary.to_json())

# convert the object into a dict
evolution_trigger_summary_dict = evolution_trigger_summary_instance.to_dict()
# create an instance of EvolutionTriggerSummary from a dict
evolution_trigger_summary_from_dict = EvolutionTriggerSummary.from_dict(evolution_trigger_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


