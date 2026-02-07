# ItemAttributeDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.item_attribute_description import ItemAttributeDescription

# TODO update the JSON string below
json = "{}"
# create an instance of ItemAttributeDescription from a JSON string
item_attribute_description_instance = ItemAttributeDescription.from_json(json)
# print the JSON string representation of the object
print(ItemAttributeDescription.to_json())

# convert the object into a dict
item_attribute_description_dict = item_attribute_description_instance.to_dict()
# create an instance of ItemAttributeDescription from a dict
item_attribute_description_from_dict = ItemAttributeDescription.from_dict(item_attribute_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


