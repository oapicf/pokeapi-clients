# PaginatedStatSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[StatSummary]**](StatSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_stat_summary_list import PaginatedStatSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedStatSummaryList from a JSON string
paginated_stat_summary_list_instance = PaginatedStatSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedStatSummaryList.to_json())

# convert the object into a dict
paginated_stat_summary_list_dict = paginated_stat_summary_list_instance.to_dict()
# create an instance of PaginatedStatSummaryList from a dict
paginated_stat_summary_list_from_dict = PaginatedStatSummaryList.from_dict(paginated_stat_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


