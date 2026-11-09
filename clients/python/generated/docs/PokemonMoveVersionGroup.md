# PokemonMoveVersionGroup


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**level_learned_at** | **int** | The minimum level to learn the move. | 
**move_learn_method** | [**MoveLearnMethodSummary**](MoveLearnMethodSummary.md) | The method by which the move is learned. | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which the move is learned. | 
**order** | **int** | Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order. | [optional] 

## Example

```python
from pokeapiclient.models.pokemon_move_version_group import PokemonMoveVersionGroup

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonMoveVersionGroup from a JSON string
pokemon_move_version_group_instance = PokemonMoveVersionGroup.from_json(json)
# print the JSON string representation of the object
print(PokemonMoveVersionGroup.to_json())

# convert the object into a dict
pokemon_move_version_group_dict = pokemon_move_version_group_instance.to_dict()
# create an instance of PokemonMoveVersionGroup from a dict
pokemon_move_version_group_from_dict = PokemonMoveVersionGroup.from_dict(pokemon_move_version_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


