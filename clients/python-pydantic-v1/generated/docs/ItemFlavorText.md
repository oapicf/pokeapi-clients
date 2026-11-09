# ItemFlavorText


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** | The localized flavor text for an API resource in a specific language. | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group which uses this flavor text. | 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 

## Example

```python
from openapi_client.models.item_flavor_text import ItemFlavorText

# TODO update the JSON string below
json = "{}"
# create an instance of ItemFlavorText from a JSON string
item_flavor_text_instance = ItemFlavorText.from_json(json)
# print the JSON string representation of the object
print ItemFlavorText.to_json()

# convert the object into a dict
item_flavor_text_dict = item_flavor_text_instance.to_dict()
# create an instance of ItemFlavorText from a dict
item_flavor_text_from_dict = ItemFlavorText.from_dict(item_flavor_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


