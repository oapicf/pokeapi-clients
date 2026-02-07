# ItemSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.item_summary import ItemSummary

# TODO update the JSON string below
json = "{}"
# create an instance of ItemSummary from a JSON string
item_summary_instance = ItemSummary.from_json(json)
# print the JSON string representation of the object
print(ItemSummary.to_json())

# convert the object into a dict
item_summary_dict = item_summary_instance.to_dict()
# create an instance of ItemSummary from a dict
item_summary_from_dict = ItemSummary.from_dict(item_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


