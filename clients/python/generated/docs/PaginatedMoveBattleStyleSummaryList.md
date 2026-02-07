# PaginatedMoveBattleStyleSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[MoveBattleStyleSummary]**](MoveBattleStyleSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_move_battle_style_summary_list import PaginatedMoveBattleStyleSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedMoveBattleStyleSummaryList from a JSON string
paginated_move_battle_style_summary_list_instance = PaginatedMoveBattleStyleSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedMoveBattleStyleSummaryList.to_json())

# convert the object into a dict
paginated_move_battle_style_summary_list_dict = paginated_move_battle_style_summary_list_instance.to_dict()
# create an instance of PaginatedMoveBattleStyleSummaryList from a dict
paginated_move_battle_style_summary_list_from_dict = PaginatedMoveBattleStyleSummaryList.from_dict(paginated_move_battle_style_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


