# PaginatedPalParkAreaSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[PalParkAreaSummary]**](PalParkAreaSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_pal_park_area_summary_list import PaginatedPalParkAreaSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedPalParkAreaSummaryList from a JSON string
paginated_pal_park_area_summary_list_instance = PaginatedPalParkAreaSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedPalParkAreaSummaryList.to_json())

# convert the object into a dict
paginated_pal_park_area_summary_list_dict = paginated_pal_park_area_summary_list_instance.to_dict()
# create an instance of PaginatedPalParkAreaSummaryList from a dict
paginated_pal_park_area_summary_list_from_dict = PaginatedPalParkAreaSummaryList.from_dict(paginated_pal_park_area_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


