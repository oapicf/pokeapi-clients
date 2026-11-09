# TypePokemon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**slot** | **int** | The order the Pokémon&#39;s types are listed in. | 
**pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that has the referenced type. | 

## Example

```python
from pokeapiclient.models.type_pokemon import TypePokemon

# TODO update the JSON string below
json = "{}"
# create an instance of TypePokemon from a JSON string
type_pokemon_instance = TypePokemon.from_json(json)
# print the JSON string representation of the object
print(TypePokemon.to_json())

# convert the object into a dict
type_pokemon_dict = type_pokemon_instance.to_dict()
# create an instance of TypePokemon from a dict
type_pokemon_from_dict = TypePokemon.from_dict(type_pokemon_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


