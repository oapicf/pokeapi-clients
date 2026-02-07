# PaginatedAbilitySummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[AbilitySummary]**](AbilitySummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_ability_summary_list import PaginatedAbilitySummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedAbilitySummaryList from a JSON string
paginated_ability_summary_list_instance = PaginatedAbilitySummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedAbilitySummaryList.to_json())

# convert the object into a dict
paginated_ability_summary_list_dict = paginated_ability_summary_list_instance.to_dict()
# create an instance of PaginatedAbilitySummaryList from a dict
paginated_ability_summary_list_from_dict = PaginatedAbilitySummaryList.from_dict(paginated_ability_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


