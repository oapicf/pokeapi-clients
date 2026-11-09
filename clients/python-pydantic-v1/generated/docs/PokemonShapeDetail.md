# PokemonShapeDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**awesome_names** | [**List[PokemonShapeAwesomeName]**](PokemonShapeAwesomeName.md) | The \&quot;scientific\&quot; name of this Pokémon shape listed in different languages. | [readonly] 
**names** | [**List[PokemonShapeName]**](PokemonShapeName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon_species** | [**List[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) | A list of the Pokémon species that have this shape. | [readonly] 

## Example

```python
from openapi_client.models.pokemon_shape_detail import PokemonShapeDetail

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonShapeDetail from a JSON string
pokemon_shape_detail_instance = PokemonShapeDetail.from_json(json)
# print the JSON string representation of the object
print PokemonShapeDetail.to_json()

# convert the object into a dict
pokemon_shape_detail_dict = pokemon_shape_detail_instance.to_dict()
# create an instance of PokemonShapeDetail from a dict
pokemon_shape_detail_from_dict = PokemonShapeDetail.from_dict(pokemon_shape_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


