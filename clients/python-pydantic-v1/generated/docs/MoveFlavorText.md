# MoveFlavorText


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flavor_text** | **str** | The localized flavor text for an api resource in a specific language. | 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group that uses this flavor text. | 

## Example

```python
from openapi_client.models.move_flavor_text import MoveFlavorText

# TODO update the JSON string below
json = "{}"
# create an instance of MoveFlavorText from a JSON string
move_flavor_text_instance = MoveFlavorText.from_json(json)
# print the JSON string representation of the object
print MoveFlavorText.to_json()

# convert the object into a dict
move_flavor_text_dict = move_flavor_text_instance.to_dict()
# create an instance of MoveFlavorText from a dict
move_flavor_text_from_dict = MoveFlavorText.from_dict(move_flavor_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


