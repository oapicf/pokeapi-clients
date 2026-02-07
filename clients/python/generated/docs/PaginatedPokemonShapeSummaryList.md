# PaginatedPokemonShapeSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[PokemonShapeSummary]**](PokemonShapeSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_pokemon_shape_summary_list import PaginatedPokemonShapeSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedPokemonShapeSummaryList from a JSON string
paginated_pokemon_shape_summary_list_instance = PaginatedPokemonShapeSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedPokemonShapeSummaryList.to_json())

# convert the object into a dict
paginated_pokemon_shape_summary_list_dict = paginated_pokemon_shape_summary_list_instance.to_dict()
# create an instance of PaginatedPokemonShapeSummaryList from a dict
paginated_pokemon_shape_summary_list_from_dict = PaginatedPokemonShapeSummaryList.from_dict(paginated_pokemon_shape_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


