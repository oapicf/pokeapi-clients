# SuperContestEffectFlavorText


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flavor_text** | **str** | The localized flavor text for an API resource in a specific language. | 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 

## Example

```python
from pokeapiclient.models.super_contest_effect_flavor_text import SuperContestEffectFlavorText

# TODO update the JSON string below
json = "{}"
# create an instance of SuperContestEffectFlavorText from a JSON string
super_contest_effect_flavor_text_instance = SuperContestEffectFlavorText.from_json(json)
# print the JSON string representation of the object
print(SuperContestEffectFlavorText.to_json())

# convert the object into a dict
super_contest_effect_flavor_text_dict = super_contest_effect_flavor_text_instance.to_dict()
# create an instance of SuperContestEffectFlavorText from a dict
super_contest_effect_flavor_text_from_dict = SuperContestEffectFlavorText.from_dict(super_contest_effect_flavor_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


