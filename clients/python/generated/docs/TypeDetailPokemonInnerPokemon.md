# TypeDetailPokemonInnerPokemon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the pokemon | [optional] 
**url** | **str** | The URL to get more information about the pokemon | [optional] 

## Example

```python
from pokeapiclient.models.type_detail_pokemon_inner_pokemon import TypeDetailPokemonInnerPokemon

# TODO update the JSON string below
json = "{}"
# create an instance of TypeDetailPokemonInnerPokemon from a JSON string
type_detail_pokemon_inner_pokemon_instance = TypeDetailPokemonInnerPokemon.from_json(json)
# print the JSON string representation of the object
print(TypeDetailPokemonInnerPokemon.to_json())

# convert the object into a dict
type_detail_pokemon_inner_pokemon_dict = type_detail_pokemon_inner_pokemon_instance.to_dict()
# create an instance of TypeDetailPokemonInnerPokemon from a dict
type_detail_pokemon_inner_pokemon_from_dict = TypeDetailPokemonInnerPokemon.from_dict(type_detail_pokemon_inner_pokemon_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


