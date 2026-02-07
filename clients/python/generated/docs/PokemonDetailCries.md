# PokemonDetailCries


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latest** | **str** |  | 
**legacy** | **str** |  | 

## Example

```python
from pokeapiclient.models.pokemon_detail_cries import PokemonDetailCries

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonDetailCries from a JSON string
pokemon_detail_cries_instance = PokemonDetailCries.from_json(json)
# print the JSON string representation of the object
print(PokemonDetailCries.to_json())

# convert the object into a dict
pokemon_detail_cries_dict = pokemon_detail_cries_instance.to_dict()
# create an instance of PokemonDetailCries from a dict
pokemon_detail_cries_from_dict = PokemonDetailCries.from_dict(pokemon_detail_cries_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


