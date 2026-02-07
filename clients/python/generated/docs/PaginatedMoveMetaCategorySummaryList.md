# PaginatedMoveMetaCategorySummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[MoveMetaCategorySummary]**](MoveMetaCategorySummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_move_meta_category_summary_list import PaginatedMoveMetaCategorySummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedMoveMetaCategorySummaryList from a JSON string
paginated_move_meta_category_summary_list_instance = PaginatedMoveMetaCategorySummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedMoveMetaCategorySummaryList.to_json())

# convert the object into a dict
paginated_move_meta_category_summary_list_dict = paginated_move_meta_category_summary_list_instance.to_dict()
# create an instance of PaginatedMoveMetaCategorySummaryList from a dict
paginated_move_meta_category_summary_list_from_dict = PaginatedMoveMetaCategorySummaryList.from_dict(paginated_move_meta_category_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


