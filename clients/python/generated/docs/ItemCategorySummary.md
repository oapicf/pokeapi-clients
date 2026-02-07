# ItemCategorySummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.item_category_summary import ItemCategorySummary

# TODO update the JSON string below
json = "{}"
# create an instance of ItemCategorySummary from a JSON string
item_category_summary_instance = ItemCategorySummary.from_json(json)
# print the JSON string representation of the object
print(ItemCategorySummary.to_json())

# convert the object into a dict
item_category_summary_dict = item_category_summary_instance.to_dict()
# create an instance of ItemCategorySummary from a dict
item_category_summary_from_dict = ItemCategorySummary.from_dict(item_category_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


