# PaginatedItemPocketSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[ItemPocketSummary]**](ItemPocketSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_item_pocket_summary_list import PaginatedItemPocketSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedItemPocketSummaryList from a JSON string
paginated_item_pocket_summary_list_instance = PaginatedItemPocketSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedItemPocketSummaryList.to_json())

# convert the object into a dict
paginated_item_pocket_summary_list_dict = paginated_item_pocket_summary_list_instance.to_dict()
# create an instance of PaginatedItemPocketSummaryList from a dict
paginated_item_pocket_summary_list_from_dict = PaginatedItemPocketSummaryList.from_dict(paginated_item_pocket_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


