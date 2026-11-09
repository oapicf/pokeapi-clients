# PokemonHeldItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that holds this item. | 
**version_details** | [**List[PokemonHeldItemVersion]**](PokemonHeldItemVersion.md) | The details for the version that this item is held in by the Pokémon. | 

## Example

```python
from openapi_client.models.pokemon_held_item import PokemonHeldItem

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonHeldItem from a JSON string
pokemon_held_item_instance = PokemonHeldItem.from_json(json)
# print the JSON string representation of the object
print PokemonHeldItem.to_json()

# convert the object into a dict
pokemon_held_item_dict = pokemon_held_item_instance.to_dict()
# create an instance of PokemonHeldItem from a dict
pokemon_held_item_from_dict = PokemonHeldItem.from_dict(pokemon_held_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


