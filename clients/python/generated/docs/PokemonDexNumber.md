# PokemonDexNumber


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entry_number** | **int** | The index of this Pokémon species entry within the Pokédex. | 
**pokemon_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species being encountered. | 

## Example

```python
from pokeapiclient.models.pokemon_dex_number import PokemonDexNumber

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonDexNumber from a JSON string
pokemon_dex_number_instance = PokemonDexNumber.from_json(json)
# print the JSON string representation of the object
print(PokemonDexNumber.to_json())

# convert the object into a dict
pokemon_dex_number_dict = pokemon_dex_number_instance.to_dict()
# create an instance of PokemonDexNumber from a dict
pokemon_dex_number_from_dict = PokemonDexNumber.from_dict(pokemon_dex_number_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


