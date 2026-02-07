# PaginatedPokemonSpeciesSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_pokemon_species_summary_list import PaginatedPokemonSpeciesSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedPokemonSpeciesSummaryList from a JSON string
paginated_pokemon_species_summary_list_instance = PaginatedPokemonSpeciesSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedPokemonSpeciesSummaryList.to_json())

# convert the object into a dict
paginated_pokemon_species_summary_list_dict = paginated_pokemon_species_summary_list_instance.to_dict()
# create an instance of PaginatedPokemonSpeciesSummaryList from a dict
paginated_pokemon_species_summary_list_from_dict = PaginatedPokemonSpeciesSummaryList.from_dict(paginated_pokemon_species_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


