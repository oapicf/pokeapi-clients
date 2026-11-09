# PaginatedVersionSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** | The total number of resources available from this API. | 
**next** | **str** | The URL for the next page in the list, or null if there is no next page. | [optional] 
**previous** | **str** | The URL for the previous page in the list, or null if there is no previous page. | [optional] 
**results** | [**List[VersionSummary]**](VersionSummary.md) | A list of API resources on this page. | 

## Example

```python
from pokeapiclient.models.paginated_version_summary_list import PaginatedVersionSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedVersionSummaryList from a JSON string
paginated_version_summary_list_instance = PaginatedVersionSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedVersionSummaryList.to_json())

# convert the object into a dict
paginated_version_summary_list_dict = paginated_version_summary_list_instance.to_dict()
# create an instance of PaginatedVersionSummaryList from a dict
paginated_version_summary_list_from_dict = PaginatedVersionSummaryList.from_dict(paginated_version_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


