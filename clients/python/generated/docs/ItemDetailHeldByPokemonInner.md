# ItemDetailHeldByPokemonInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pokemon** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**version_details** | [**List[ItemDetailHeldByPokemonInnerVersionDetailsInner]**](ItemDetailHeldByPokemonInnerVersionDetailsInner.md) |  | 

## Example

```python
from pokeapiclient.models.item_detail_held_by_pokemon_inner import ItemDetailHeldByPokemonInner

# TODO update the JSON string below
json = "{}"
# create an instance of ItemDetailHeldByPokemonInner from a JSON string
item_detail_held_by_pokemon_inner_instance = ItemDetailHeldByPokemonInner.from_json(json)
# print the JSON string representation of the object
print(ItemDetailHeldByPokemonInner.to_json())

# convert the object into a dict
item_detail_held_by_pokemon_inner_dict = item_detail_held_by_pokemon_inner_instance.to_dict()
# create an instance of ItemDetailHeldByPokemonInner from a dict
item_detail_held_by_pokemon_inner_from_dict = ItemDetailHeldByPokemonInner.from_dict(item_detail_held_by_pokemon_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


