# PokedexDetailPokemonEntriesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entry_number** | **int** |  | 
**pokemon_species** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.pokedex_detail_pokemon_entries_inner import PokedexDetailPokemonEntriesInner

# TODO update the JSON string below
json = "{}"
# create an instance of PokedexDetailPokemonEntriesInner from a JSON string
pokedex_detail_pokemon_entries_inner_instance = PokedexDetailPokemonEntriesInner.from_json(json)
# print the JSON string representation of the object
print(PokedexDetailPokemonEntriesInner.to_json())

# convert the object into a dict
pokedex_detail_pokemon_entries_inner_dict = pokedex_detail_pokemon_entries_inner_instance.to_dict()
# create an instance of PokedexDetailPokemonEntriesInner from a dict
pokedex_detail_pokemon_entries_inner_from_dict = PokedexDetailPokemonEntriesInner.from_dict(pokedex_detail_pokemon_entries_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


