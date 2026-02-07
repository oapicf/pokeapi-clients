# PaginatedNatureSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[NatureSummary]**](NatureSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_nature_summary_list import PaginatedNatureSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedNatureSummaryList from a JSON string
paginated_nature_summary_list_instance = PaginatedNatureSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedNatureSummaryList.to_json())

# convert the object into a dict
paginated_nature_summary_list_dict = paginated_nature_summary_list_instance.to_dict()
# create an instance of PaginatedNatureSummaryList from a dict
paginated_nature_summary_list_from_dict = PaginatedNatureSummaryList.from_dict(paginated_nature_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


