# ItemAttributeSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.item_attribute_summary import ItemAttributeSummary

# TODO update the JSON string below
json = "{}"
# create an instance of ItemAttributeSummary from a JSON string
item_attribute_summary_instance = ItemAttributeSummary.from_json(json)
# print the JSON string representation of the object
print(ItemAttributeSummary.to_json())

# convert the object into a dict
item_attribute_summary_dict = item_attribute_summary_instance.to_dict()
# create an instance of ItemAttributeSummary from a dict
item_attribute_summary_from_dict = ItemAttributeSummary.from_dict(item_attribute_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


