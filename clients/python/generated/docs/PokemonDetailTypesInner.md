# PokemonDetailTypesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**slot** | **int** |  | 
**type** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_detail_types_inner import PokemonDetailTypesInner

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonDetailTypesInner from a JSON string
pokemon_detail_types_inner_instance = PokemonDetailTypesInner.from_json(json)
# print the JSON string representation of the object
print(PokemonDetailTypesInner.to_json())

# convert the object into a dict
pokemon_detail_types_inner_dict = pokemon_detail_types_inner_instance.to_dict()
# create an instance of PokemonDetailTypesInner from a dict
pokemon_detail_types_inner_from_dict = PokemonDetailTypesInner.from_dict(pokemon_detail_types_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


