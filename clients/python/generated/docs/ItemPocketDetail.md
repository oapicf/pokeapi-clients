# ItemPocketDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**categories** | [**List[ItemCategorySummary]**](ItemCategorySummary.md) |  | 
**names** | [**List[ItemPocketName]**](ItemPocketName.md) |  | 

## Example

```python
from pokeapiclient.models.item_pocket_detail import ItemPocketDetail

# TODO update the JSON string below
json = "{}"
# create an instance of ItemPocketDetail from a JSON string
item_pocket_detail_instance = ItemPocketDetail.from_json(json)
# print the JSON string representation of the object
print(ItemPocketDetail.to_json())

# convert the object into a dict
item_pocket_detail_dict = item_pocket_detail_instance.to_dict()
# create an instance of ItemPocketDetail from a dict
item_pocket_detail_from_dict = ItemPocketDetail.from_dict(item_pocket_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


