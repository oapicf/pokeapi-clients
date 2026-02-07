# PaginatedVersionGroupSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[VersionGroupSummary]**](VersionGroupSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_version_group_summary_list import PaginatedVersionGroupSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedVersionGroupSummaryList from a JSON string
paginated_version_group_summary_list_instance = PaginatedVersionGroupSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedVersionGroupSummaryList.to_json())

# convert the object into a dict
paginated_version_group_summary_list_dict = paginated_version_group_summary_list_instance.to_dict()
# create an instance of PaginatedVersionGroupSummaryList from a dict
paginated_version_group_summary_list_from_dict = PaginatedVersionGroupSummaryList.from_dict(paginated_version_group_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


