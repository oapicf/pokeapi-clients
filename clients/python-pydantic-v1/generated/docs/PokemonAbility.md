# PokemonAbility


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_hidden** | **bool** | Whether or not this is a hidden ability. | [optional] 
**slot** | **int** | The slot this ability occupies in this Pokémon species. | 
**ability** | [**AbilitySummary**](AbilitySummary.md) | The ability the Pokémon may have. | 

## Example

```python
from openapi_client.models.pokemon_ability import PokemonAbility

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonAbility from a JSON string
pokemon_ability_instance = PokemonAbility.from_json(json)
# print the JSON string representation of the object
print PokemonAbility.to_json()

# convert the object into a dict
pokemon_ability_dict = pokemon_ability_instance.to_dict()
# create an instance of PokemonAbility from a dict
pokemon_ability_from_dict = PokemonAbility.from_dict(pokemon_ability_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


