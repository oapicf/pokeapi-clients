# PaginatedItemSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[ItemSummary]**](ItemSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_item_summary_list import PaginatedItemSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedItemSummaryList from a JSON string
paginated_item_summary_list_instance = PaginatedItemSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedItemSummaryList.to_json())

# convert the object into a dict
paginated_item_summary_list_dict = paginated_item_summary_list_instance.to_dict()
# create an instance of PaginatedItemSummaryList from a dict
paginated_item_summary_list_from_dict = PaginatedItemSummaryList.from_dict(paginated_item_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


