# EvolutionTriggerName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.evolution_trigger_name import EvolutionTriggerName

# TODO update the JSON string below
json = "{}"
# create an instance of EvolutionTriggerName from a JSON string
evolution_trigger_name_instance = EvolutionTriggerName.from_json(json)
# print the JSON string representation of the object
print(EvolutionTriggerName.to_json())

# convert the object into a dict
evolution_trigger_name_dict = evolution_trigger_name_instance.to_dict()
# create an instance of EvolutionTriggerName from a dict
evolution_trigger_name_from_dict = EvolutionTriggerName.from_dict(evolution_trigger_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


