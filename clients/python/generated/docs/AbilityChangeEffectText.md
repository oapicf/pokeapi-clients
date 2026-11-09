# AbilityChangeEffectText


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effect** | **str** | The localized effect text for an API resource in a specific language. | 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this effect is in. | 

## Example

```python
from pokeapiclient.models.ability_change_effect_text import AbilityChangeEffectText

# TODO update the JSON string below
json = "{}"
# create an instance of AbilityChangeEffectText from a JSON string
ability_change_effect_text_instance = AbilityChangeEffectText.from_json(json)
# print the JSON string representation of the object
print(AbilityChangeEffectText.to_json())

# convert the object into a dict
ability_change_effect_text_dict = ability_change_effect_text_instance.to_dict()
# create an instance of AbilityChangeEffectText from a dict
ability_change_effect_text_from_dict = AbilityChangeEffectText.from_dict(ability_change_effect_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


