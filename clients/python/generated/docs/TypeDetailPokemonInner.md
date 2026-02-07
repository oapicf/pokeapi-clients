# TypeDetailPokemonInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**slot** | **int** |  | [optional] 
**pokemon** | [**TypeDetailPokemonInnerPokemon**](TypeDetailPokemonInnerPokemon.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.type_detail_pokemon_inner import TypeDetailPokemonInner

# TODO update the JSON string below
json = "{}"
# create an instance of TypeDetailPokemonInner from a JSON string
type_detail_pokemon_inner_instance = TypeDetailPokemonInner.from_json(json)
# print the JSON string representation of the object
print(TypeDetailPokemonInner.to_json())

# convert the object into a dict
type_detail_pokemon_inner_dict = type_detail_pokemon_inner_instance.to_dict()
# create an instance of TypeDetailPokemonInner from a dict
type_detail_pokemon_inner_from_dict = TypeDetailPokemonInner.from_dict(type_detail_pokemon_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


