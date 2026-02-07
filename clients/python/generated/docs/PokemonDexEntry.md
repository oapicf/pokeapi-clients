# PokemonDexEntry


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entry_number** | **int** |  | 
**pokedex** | [**PokedexSummary**](PokedexSummary.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_dex_entry import PokemonDexEntry

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonDexEntry from a JSON string
pokemon_dex_entry_instance = PokemonDexEntry.from_json(json)
# print the JSON string representation of the object
print(PokemonDexEntry.to_json())

# convert the object into a dict
pokemon_dex_entry_dict = pokemon_dex_entry_instance.to_dict()
# create an instance of PokemonDexEntry from a dict
pokemon_dex_entry_from_dict = PokemonDexEntry.from_dict(pokemon_dex_entry_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


