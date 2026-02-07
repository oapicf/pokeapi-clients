# ItemAttributeName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.item_attribute_name import ItemAttributeName

# TODO update the JSON string below
json = "{}"
# create an instance of ItemAttributeName from a JSON string
item_attribute_name_instance = ItemAttributeName.from_json(json)
# print the JSON string representation of the object
print(ItemAttributeName.to_json())

# convert the object into a dict
item_attribute_name_dict = item_attribute_name_instance.to_dict()
# create an instance of ItemAttributeName from a dict
item_attribute_name_from_dict = ItemAttributeName.from_dict(item_attribute_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


