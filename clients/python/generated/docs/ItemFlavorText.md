# ItemFlavorText


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** |  | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.item_flavor_text import ItemFlavorText

# TODO update the JSON string below
json = "{}"
# create an instance of ItemFlavorText from a JSON string
item_flavor_text_instance = ItemFlavorText.from_json(json)
# print the JSON string representation of the object
print(ItemFlavorText.to_json())

# convert the object into a dict
item_flavor_text_dict = item_flavor_text_instance.to_dict()
# create an instance of ItemFlavorText from a dict
item_flavor_text_from_dict = ItemFlavorText.from_dict(item_flavor_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


