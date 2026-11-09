# PaginatedBerryFlavorSummaryList


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** | The total number of resources available from this API. | 
**next** | **str** | The URL for the next page in the list, or null if there is no next page. | [optional] 
**previous** | **str** | The URL for the previous page in the list, or null if there is no previous page. | [optional] 
**results** | [**List[BerryFlavorSummary]**](BerryFlavorSummary.md) | A list of API resources on this page. | 

## Example

```python
from openapi_client.models.paginated_berry_flavor_summary_list import PaginatedBerryFlavorSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedBerryFlavorSummaryList from a JSON string
paginated_berry_flavor_summary_list_instance = PaginatedBerryFlavorSummaryList.from_json(json)
# print the JSON string representation of the object
print PaginatedBerryFlavorSummaryList.to_json()

# convert the object into a dict
paginated_berry_flavor_summary_list_dict = paginated_berry_flavor_summary_list_instance.to_dict()
# create an instance of PaginatedBerryFlavorSummaryList from a dict
paginated_berry_flavor_summary_list_from_dict = PaginatedBerryFlavorSummaryList.from_dict(paginated_berry_flavor_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


