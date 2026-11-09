# PokemonCries


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latest** | **str** | The latest depiction of this Pokémon&#39;s cry. | 
**legacy** | **str** | The legacy depiction of this Pokémon&#39;s cry. | 

## Example

```python
from pokeapiclient.models.pokemon_cries import PokemonCries

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonCries from a JSON string
pokemon_cries_instance = PokemonCries.from_json(json)
# print the JSON string representation of the object
print(PokemonCries.to_json())

# convert the object into a dict
pokemon_cries_dict = pokemon_cries_instance.to_dict()
# create an instance of PokemonCries from a dict
pokemon_cries_from_dict = PokemonCries.from_dict(pokemon_cries_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


