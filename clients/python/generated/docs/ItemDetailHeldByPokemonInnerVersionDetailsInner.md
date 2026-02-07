# ItemDetailHeldByPokemonInnerVersionDetailsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rarity** | **int** |  | 
**version** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.item_detail_held_by_pokemon_inner_version_details_inner import ItemDetailHeldByPokemonInnerVersionDetailsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ItemDetailHeldByPokemonInnerVersionDetailsInner from a JSON string
item_detail_held_by_pokemon_inner_version_details_inner_instance = ItemDetailHeldByPokemonInnerVersionDetailsInner.from_json(json)
# print the JSON string representation of the object
print(ItemDetailHeldByPokemonInnerVersionDetailsInner.to_json())

# convert the object into a dict
item_detail_held_by_pokemon_inner_version_details_inner_dict = item_detail_held_by_pokemon_inner_version_details_inner_instance.to_dict()
# create an instance of ItemDetailHeldByPokemonInnerVersionDetailsInner from a dict
item_detail_held_by_pokemon_inner_version_details_inner_from_dict = ItemDetailHeldByPokemonInnerVersionDetailsInner.from_dict(item_detail_held_by_pokemon_inner_version_details_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


