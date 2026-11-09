# PokemonMove


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**move** | [**MoveSummary**](MoveSummary.md) | The move the Pokémon can learn. | 
**version_group_details** | [**List[PokemonMoveVersionGroup]**](PokemonMoveVersionGroup.md) | The details of the version in which the Pokémon can learn the move. | 

## Example

```python
from openapi_client.models.pokemon_move import PokemonMove

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonMove from a JSON string
pokemon_move_instance = PokemonMove.from_json(json)
# print the JSON string representation of the object
print PokemonMove.to_json()

# convert the object into a dict
pokemon_move_dict = pokemon_move_instance.to_dict()
# create an instance of PokemonMove from a dict
pokemon_move_from_dict = PokemonMove.from_dict(pokemon_move_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


