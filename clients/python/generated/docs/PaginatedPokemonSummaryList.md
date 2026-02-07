# PaginatedPokemonSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[PokemonSummary]**](PokemonSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_pokemon_summary_list import PaginatedPokemonSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedPokemonSummaryList from a JSON string
paginated_pokemon_summary_list_instance = PaginatedPokemonSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedPokemonSummaryList.to_json())

# convert the object into a dict
paginated_pokemon_summary_list_dict = paginated_pokemon_summary_list_instance.to_dict()
# create an instance of PaginatedPokemonSummaryList from a dict
paginated_pokemon_summary_list_from_dict = PaginatedPokemonSummaryList.from_dict(paginated_pokemon_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


