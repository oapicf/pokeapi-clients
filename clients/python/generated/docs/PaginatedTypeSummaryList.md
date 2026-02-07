# PaginatedTypeSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[TypeSummary]**](TypeSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_type_summary_list import PaginatedTypeSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedTypeSummaryList from a JSON string
paginated_type_summary_list_instance = PaginatedTypeSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedTypeSummaryList.to_json())

# convert the object into a dict
paginated_type_summary_list_dict = paginated_type_summary_list_instance.to_dict()
# create an instance of PaginatedTypeSummaryList from a dict
paginated_type_summary_list_from_dict = PaginatedTypeSummaryList.from_dict(paginated_type_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


