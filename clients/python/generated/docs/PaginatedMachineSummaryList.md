# PaginatedMachineSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[MachineSummary]**](MachineSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_machine_summary_list import PaginatedMachineSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedMachineSummaryList from a JSON string
paginated_machine_summary_list_instance = PaginatedMachineSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedMachineSummaryList.to_json())

# convert the object into a dict
paginated_machine_summary_list_dict = paginated_machine_summary_list_instance.to_dict()
# create an instance of PaginatedMachineSummaryList from a dict
paginated_machine_summary_list_from_dict = PaginatedMachineSummaryList.from_dict(paginated_machine_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


