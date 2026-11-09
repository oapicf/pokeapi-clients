# PokemonHeldItemVersion


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rarity** | **int** | How often the item is held. | 
**version** | [**VersionSummary**](VersionSummary.md) | The version in which the item is held. | 

## Example

```python
from pokeapiclient.models.pokemon_held_item_version import PokemonHeldItemVersion

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonHeldItemVersion from a JSON string
pokemon_held_item_version_instance = PokemonHeldItemVersion.from_json(json)
# print the JSON string representation of the object
print(PokemonHeldItemVersion.to_json())

# convert the object into a dict
pokemon_held_item_version_dict = pokemon_held_item_version_instance.to_dict()
# create an instance of PokemonHeldItemVersion from a dict
pokemon_held_item_version_from_dict = PokemonHeldItemVersion.from_dict(pokemon_held_item_version_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


