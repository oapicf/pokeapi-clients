# PaginatedGenderSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[GenderSummary]**](GenderSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_gender_summary_list import PaginatedGenderSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedGenderSummaryList from a JSON string
paginated_gender_summary_list_instance = PaginatedGenderSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedGenderSummaryList.to_json())

# convert the object into a dict
paginated_gender_summary_list_dict = paginated_gender_summary_list_instance.to_dict()
# create an instance of PaginatedGenderSummaryList from a dict
paginated_gender_summary_list_from_dict = PaginatedGenderSummaryList.from_dict(paginated_gender_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


