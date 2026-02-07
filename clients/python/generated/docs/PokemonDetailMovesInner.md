# PokemonDetailMovesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**move** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**version_group_details** | [**List[PokemonDetailMovesInnerVersionGroupDetailsInner]**](PokemonDetailMovesInnerVersionGroupDetailsInner.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_detail_moves_inner import PokemonDetailMovesInner

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonDetailMovesInner from a JSON string
pokemon_detail_moves_inner_instance = PokemonDetailMovesInner.from_json(json)
# print the JSON string representation of the object
print(PokemonDetailMovesInner.to_json())

# convert the object into a dict
pokemon_detail_moves_inner_dict = pokemon_detail_moves_inner_instance.to_dict()
# create an instance of PokemonDetailMovesInner from a dict
pokemon_detail_moves_inner_from_dict = PokemonDetailMovesInner.from_dict(pokemon_detail_moves_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


