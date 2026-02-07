# PaginatedRegionSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[RegionSummary]**](RegionSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_region_summary_list import PaginatedRegionSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedRegionSummaryList from a JSON string
paginated_region_summary_list_instance = PaginatedRegionSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedRegionSummaryList.to_json())

# convert the object into a dict
paginated_region_summary_list_dict = paginated_region_summary_list_instance.to_dict()
# create an instance of PaginatedRegionSummaryList from a dict
paginated_region_summary_list_from_dict = PaginatedRegionSummaryList.from_dict(paginated_region_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


