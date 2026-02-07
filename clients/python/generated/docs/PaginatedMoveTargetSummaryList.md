# PaginatedMoveTargetSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[MoveTargetSummary]**](MoveTargetSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_move_target_summary_list import PaginatedMoveTargetSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedMoveTargetSummaryList from a JSON string
paginated_move_target_summary_list_instance = PaginatedMoveTargetSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedMoveTargetSummaryList.to_json())

# convert the object into a dict
paginated_move_target_summary_list_dict = paginated_move_target_summary_list_instance.to_dict()
# create an instance of PaginatedMoveTargetSummaryList from a dict
paginated_move_target_summary_list_from_dict = PaginatedMoveTargetSummaryList.from_dict(paginated_move_target_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


