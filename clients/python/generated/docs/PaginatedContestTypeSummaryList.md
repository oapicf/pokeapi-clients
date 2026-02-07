# PaginatedContestTypeSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[ContestTypeSummary]**](ContestTypeSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_contest_type_summary_list import PaginatedContestTypeSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedContestTypeSummaryList from a JSON string
paginated_contest_type_summary_list_instance = PaginatedContestTypeSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedContestTypeSummaryList.to_json())

# convert the object into a dict
paginated_contest_type_summary_list_dict = paginated_contest_type_summary_list_instance.to_dict()
# create an instance of PaginatedContestTypeSummaryList from a dict
paginated_contest_type_summary_list_from_dict = PaginatedContestTypeSummaryList.from_dict(paginated_contest_type_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


