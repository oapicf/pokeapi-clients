# ItemEffectText


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effect** | **str** | The localized effect text for an API resource in a specific language. | 
**short_effect** | **str** | The localized effect text in brief. | 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this effect is in. | 

## Example

```python
from pokeapiclient.models.item_effect_text import ItemEffectText

# TODO update the JSON string below
json = "{}"
# create an instance of ItemEffectText from a JSON string
item_effect_text_instance = ItemEffectText.from_json(json)
# print the JSON string representation of the object
print(ItemEffectText.to_json())

# convert the object into a dict
item_effect_text_dict = item_effect_text_instance.to_dict()
# create an instance of ItemEffectText from a dict
item_effect_text_from_dict = ItemEffectText.from_dict(item_effect_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


