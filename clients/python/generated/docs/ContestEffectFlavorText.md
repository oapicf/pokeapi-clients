# ContestEffectFlavorText


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flavor_text** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.contest_effect_flavor_text import ContestEffectFlavorText

# TODO update the JSON string below
json = "{}"
# create an instance of ContestEffectFlavorText from a JSON string
contest_effect_flavor_text_instance = ContestEffectFlavorText.from_json(json)
# print the JSON string representation of the object
print(ContestEffectFlavorText.to_json())

# convert the object into a dict
contest_effect_flavor_text_dict = contest_effect_flavor_text_instance.to_dict()
# create an instance of ContestEffectFlavorText from a dict
contest_effect_flavor_text_from_dict = ContestEffectFlavorText.from_dict(contest_effect_flavor_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


