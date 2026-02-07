# ItemCategoryDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**items** | [**List[ItemSummary]**](ItemSummary.md) |  | 
**names** | [**List[ItemCategoryName]**](ItemCategoryName.md) |  | 
**pocket** | [**ItemPocketSummary**](ItemPocketSummary.md) |  | 

## Example

```python
from pokeapiclient.models.item_category_detail import ItemCategoryDetail

# TODO update the JSON string below
json = "{}"
# create an instance of ItemCategoryDetail from a JSON string
item_category_detail_instance = ItemCategoryDetail.from_json(json)
# print the JSON string representation of the object
print(ItemCategoryDetail.to_json())

# convert the object into a dict
item_category_detail_dict = item_category_detail_instance.to_dict()
# create an instance of ItemCategoryDetail from a dict
item_category_detail_from_dict = ItemCategoryDetail.from_dict(item_category_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


