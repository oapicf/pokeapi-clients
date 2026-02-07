# PokemonDetailMovesInnerVersionGroupDetailsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**level_learned_at** | **int** |  | 
**move_learn_method** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**version_group** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_detail_moves_inner_version_group_details_inner import PokemonDetailMovesInnerVersionGroupDetailsInner

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonDetailMovesInnerVersionGroupDetailsInner from a JSON string
pokemon_detail_moves_inner_version_group_details_inner_instance = PokemonDetailMovesInnerVersionGroupDetailsInner.from_json(json)
# print the JSON string representation of the object
print(PokemonDetailMovesInnerVersionGroupDetailsInner.to_json())

# convert the object into a dict
pokemon_detail_moves_inner_version_group_details_inner_dict = pokemon_detail_moves_inner_version_group_details_inner_instance.to_dict()
# create an instance of PokemonDetailMovesInnerVersionGroupDetailsInner from a dict
pokemon_detail_moves_inner_version_group_details_inner_from_dict = PokemonDetailMovesInnerVersionGroupDetailsInner.from_dict(pokemon_detail_moves_inner_version_group_details_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


