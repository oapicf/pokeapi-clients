# PokemonGameIndex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**game_index** | **int** |  | 
**version** | [**VersionSummary**](VersionSummary.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_game_index import PokemonGameIndex

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonGameIndex from a JSON string
pokemon_game_index_instance = PokemonGameIndex.from_json(json)
# print the JSON string representation of the object
print(PokemonGameIndex.to_json())

# convert the object into a dict
pokemon_game_index_dict = pokemon_game_index_instance.to_dict()
# create an instance of PokemonGameIndex from a dict
pokemon_game_index_from_dict = PokemonGameIndex.from_dict(pokemon_game_index_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


