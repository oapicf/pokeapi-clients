# PokemonColorDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**names** | [**List[PokemonColorName]**](PokemonColorName.md) |  | 
**pokemon_species** | [**List[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_color_detail import PokemonColorDetail

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonColorDetail from a JSON string
pokemon_color_detail_instance = PokemonColorDetail.from_json(json)
# print the JSON string representation of the object
print(PokemonColorDetail.to_json())

# convert the object into a dict
pokemon_color_detail_dict = pokemon_color_detail_instance.to_dict()
# create an instance of PokemonColorDetail from a dict
pokemon_color_detail_from_dict = PokemonColorDetail.from_dict(pokemon_color_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


