# ItemPocketSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.item_pocket_summary import ItemPocketSummary

# TODO update the JSON string below
json = "{}"
# create an instance of ItemPocketSummary from a JSON string
item_pocket_summary_instance = ItemPocketSummary.from_json(json)
# print the JSON string representation of the object
print(ItemPocketSummary.to_json())

# convert the object into a dict
item_pocket_summary_dict = item_pocket_summary_instance.to_dict()
# create an instance of ItemPocketSummary from a dict
item_pocket_summary_from_dict = ItemPocketSummary.from_dict(item_pocket_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


