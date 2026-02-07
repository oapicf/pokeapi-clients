# PaginatedEggGroupSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[EggGroupSummary]**](EggGroupSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_egg_group_summary_list import PaginatedEggGroupSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedEggGroupSummaryList from a JSON string
paginated_egg_group_summary_list_instance = PaginatedEggGroupSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedEggGroupSummaryList.to_json())

# convert the object into a dict
paginated_egg_group_summary_list_dict = paginated_egg_group_summary_list_instance.to_dict()
# create an instance of PaginatedEggGroupSummaryList from a dict
paginated_egg_group_summary_list_from_dict = PaginatedEggGroupSummaryList.from_dict(paginated_egg_group_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


