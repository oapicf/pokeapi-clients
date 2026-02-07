# AbilityEffectText


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effect** | **str** |  | 
**short_effect** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.ability_effect_text import AbilityEffectText

# TODO update the JSON string below
json = "{}"
# create an instance of AbilityEffectText from a JSON string
ability_effect_text_instance = AbilityEffectText.from_json(json)
# print the JSON string representation of the object
print(AbilityEffectText.to_json())

# convert the object into a dict
ability_effect_text_dict = ability_effect_text_instance.to_dict()
# create an instance of AbilityEffectText from a dict
ability_effect_text_from_dict = AbilityEffectText.from_dict(ability_effect_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


