# PokemonFormTriggerCondition


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trigger** | **str** | The trigger for this form change. | 
**name** | **str** | The name of the required item, ability, or move. Only present for a resource-based trigger. | [optional] 
**url** | **str** | The URL of the required item, ability, or move. Only present for a resource-based trigger. | [optional] 
**base_form** | [**PokemonFormSummary**](PokemonFormSummary.md) | The required base form. Only present when the trigger specifies one. | [optional] 

## Example

```python
from openapi_client.models.pokemon_form_trigger_condition import PokemonFormTriggerCondition

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonFormTriggerCondition from a JSON string
pokemon_form_trigger_condition_instance = PokemonFormTriggerCondition.from_json(json)
# print the JSON string representation of the object
print PokemonFormTriggerCondition.to_json()

# convert the object into a dict
pokemon_form_trigger_condition_dict = pokemon_form_trigger_condition_instance.to_dict()
# create an instance of PokemonFormTriggerCondition from a dict
pokemon_form_trigger_condition_from_dict = PokemonFormTriggerCondition.from_dict(pokemon_form_trigger_condition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


