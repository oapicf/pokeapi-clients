# AbilityDetailPokemonInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_hidden** | **bool** |  | 
**slot** | **int** |  | 
**pokemon** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.ability_detail_pokemon_inner import AbilityDetailPokemonInner

# TODO update the JSON string below
json = "{}"
# create an instance of AbilityDetailPokemonInner from a JSON string
ability_detail_pokemon_inner_instance = AbilityDetailPokemonInner.from_json(json)
# print the JSON string representation of the object
print(AbilityDetailPokemonInner.to_json())

# convert the object into a dict
ability_detail_pokemon_inner_dict = ability_detail_pokemon_inner_instance.to_dict()
# create an instance of AbilityDetailPokemonInner from a dict
ability_detail_pokemon_inner_from_dict = AbilityDetailPokemonInner.from_dict(ability_detail_pokemon_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


