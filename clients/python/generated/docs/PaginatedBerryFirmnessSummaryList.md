# PaginatedBerryFirmnessSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[BerryFirmnessSummary]**](BerryFirmnessSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_berry_firmness_summary_list import PaginatedBerryFirmnessSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedBerryFirmnessSummaryList from a JSON string
paginated_berry_firmness_summary_list_instance = PaginatedBerryFirmnessSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedBerryFirmnessSummaryList.to_json())

# convert the object into a dict
paginated_berry_firmness_summary_list_dict = paginated_berry_firmness_summary_list_instance.to_dict()
# create an instance of PaginatedBerryFirmnessSummaryList from a dict
paginated_berry_firmness_summary_list_from_dict = PaginatedBerryFirmnessSummaryList.from_dict(paginated_berry_firmness_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


