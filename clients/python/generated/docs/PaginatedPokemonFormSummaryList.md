# PaginatedPokemonFormSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[PokemonFormSummary]**](PokemonFormSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_pokemon_form_summary_list import PaginatedPokemonFormSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedPokemonFormSummaryList from a JSON string
paginated_pokemon_form_summary_list_instance = PaginatedPokemonFormSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedPokemonFormSummaryList.to_json())

# convert the object into a dict
paginated_pokemon_form_summary_list_dict = paginated_pokemon_form_summary_list_instance.to_dict()
# create an instance of PaginatedPokemonFormSummaryList from a dict
paginated_pokemon_form_summary_list_from_dict = PaginatedPokemonFormSummaryList.from_dict(paginated_pokemon_form_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


