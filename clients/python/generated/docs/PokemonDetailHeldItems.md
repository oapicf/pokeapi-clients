# PokemonDetailHeldItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**version_details** | [**List[ItemDetailHeldByPokemonInnerVersionDetailsInner]**](ItemDetailHeldByPokemonInnerVersionDetailsInner.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_detail_held_items import PokemonDetailHeldItems

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonDetailHeldItems from a JSON string
pokemon_detail_held_items_instance = PokemonDetailHeldItems.from_json(json)
# print the JSON string representation of the object
print(PokemonDetailHeldItems.to_json())

# convert the object into a dict
pokemon_detail_held_items_dict = pokemon_detail_held_items_instance.to_dict()
# create an instance of PokemonDetailHeldItems from a dict
pokemon_detail_held_items_from_dict = PokemonDetailHeldItems.from_dict(pokemon_detail_held_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


