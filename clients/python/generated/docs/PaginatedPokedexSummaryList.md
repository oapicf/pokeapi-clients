# PaginatedPokedexSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[PokedexSummary]**](PokedexSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_pokedex_summary_list import PaginatedPokedexSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedPokedexSummaryList from a JSON string
paginated_pokedex_summary_list_instance = PaginatedPokedexSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedPokedexSummaryList.to_json())

# convert the object into a dict
paginated_pokedex_summary_list_dict = paginated_pokedex_summary_list_instance.to_dict()
# create an instance of PaginatedPokedexSummaryList from a dict
paginated_pokedex_summary_list_from_dict = PaginatedPokedexSummaryList.from_dict(paginated_pokedex_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


