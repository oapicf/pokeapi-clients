# MoveEffectChangeEffectText


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effect** | **str** | The localized effect text for an API resource in a specific language. | 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this effect is in. | 

## Example

```python
from openapi_client.models.move_effect_change_effect_text import MoveEffectChangeEffectText

# TODO update the JSON string below
json = "{}"
# create an instance of MoveEffectChangeEffectText from a JSON string
move_effect_change_effect_text_instance = MoveEffectChangeEffectText.from_json(json)
# print the JSON string representation of the object
print MoveEffectChangeEffectText.to_json()

# convert the object into a dict
move_effect_change_effect_text_dict = move_effect_change_effect_text_instance.to_dict()
# create an instance of MoveEffectChangeEffectText from a dict
move_effect_change_effect_text_from_dict = MoveEffectChangeEffectText.from_dict(move_effect_change_effect_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


