# PaginatedGrowthRateSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[GrowthRateSummary]**](GrowthRateSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_growth_rate_summary_list import PaginatedGrowthRateSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedGrowthRateSummaryList from a JSON string
paginated_growth_rate_summary_list_instance = PaginatedGrowthRateSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedGrowthRateSummaryList.to_json())

# convert the object into a dict
paginated_growth_rate_summary_list_dict = paginated_growth_rate_summary_list_instance.to_dict()
# create an instance of PaginatedGrowthRateSummaryList from a dict
paginated_growth_rate_summary_list_from_dict = PaginatedGrowthRateSummaryList.from_dict(paginated_growth_rate_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


