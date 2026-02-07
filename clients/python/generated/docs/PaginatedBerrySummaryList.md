# PaginatedBerrySummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[BerrySummary]**](BerrySummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_berry_summary_list import PaginatedBerrySummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedBerrySummaryList from a JSON string
paginated_berry_summary_list_instance = PaginatedBerrySummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedBerrySummaryList.to_json())

# convert the object into a dict
paginated_berry_summary_list_dict = paginated_berry_summary_list_instance.to_dict()
# create an instance of PaginatedBerrySummaryList from a dict
paginated_berry_summary_list_from_dict = PaginatedBerrySummaryList.from_dict(paginated_berry_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


