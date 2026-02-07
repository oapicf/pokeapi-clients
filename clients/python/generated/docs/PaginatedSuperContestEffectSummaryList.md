# PaginatedSuperContestEffectSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[SuperContestEffectSummary]**](SuperContestEffectSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_super_contest_effect_summary_list import PaginatedSuperContestEffectSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedSuperContestEffectSummaryList from a JSON string
paginated_super_contest_effect_summary_list_instance = PaginatedSuperContestEffectSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedSuperContestEffectSummaryList.to_json())

# convert the object into a dict
paginated_super_contest_effect_summary_list_dict = paginated_super_contest_effect_summary_list_instance.to_dict()
# create an instance of PaginatedSuperContestEffectSummaryList from a dict
paginated_super_contest_effect_summary_list_from_dict = PaginatedSuperContestEffectSummaryList.from_dict(paginated_super_contest_effect_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


