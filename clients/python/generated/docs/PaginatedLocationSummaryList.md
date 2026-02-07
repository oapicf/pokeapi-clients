# PaginatedLocationSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[LocationSummary]**](LocationSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_location_summary_list import PaginatedLocationSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedLocationSummaryList from a JSON string
paginated_location_summary_list_instance = PaginatedLocationSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedLocationSummaryList.to_json())

# convert the object into a dict
paginated_location_summary_list_dict = paginated_location_summary_list_instance.to_dict()
# create an instance of PaginatedLocationSummaryList from a dict
paginated_location_summary_list_from_dict = PaginatedLocationSummaryList.from_dict(paginated_location_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


