# PaginatedContestEffectSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[ContestEffectSummary]**](ContestEffectSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_contest_effect_summary_list import PaginatedContestEffectSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedContestEffectSummaryList from a JSON string
paginated_contest_effect_summary_list_instance = PaginatedContestEffectSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedContestEffectSummaryList.to_json())

# convert the object into a dict
paginated_contest_effect_summary_list_dict = paginated_contest_effect_summary_list_instance.to_dict()
# create an instance of PaginatedContestEffectSummaryList from a dict
paginated_contest_effect_summary_list_from_dict = PaginatedContestEffectSummaryList.from_dict(paginated_contest_effect_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


