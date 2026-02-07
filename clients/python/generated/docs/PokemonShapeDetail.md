# PokemonShapeDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**awesome_names** | [**List[PokemonShapeDetailAwesomeNamesInner]**](PokemonShapeDetailAwesomeNamesInner.md) |  | 
**names** | [**List[PokemonShapeDetailNamesInner]**](PokemonShapeDetailNamesInner.md) |  | 
**pokemon_species** | [**List[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_shape_detail import PokemonShapeDetail

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonShapeDetail from a JSON string
pokemon_shape_detail_instance = PokemonShapeDetail.from_json(json)
# print the JSON string representation of the object
print(PokemonShapeDetail.to_json())

# convert the object into a dict
pokemon_shape_detail_dict = pokemon_shape_detail_instance.to_dict()
# create an instance of PokemonShapeDetail from a dict
pokemon_shape_detail_from_dict = PokemonShapeDetail.from_dict(pokemon_shape_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


