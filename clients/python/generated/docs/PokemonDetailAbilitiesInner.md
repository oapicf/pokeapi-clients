# PokemonDetailAbilitiesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ability** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**is_hidden** | **bool** |  | 
**slot** | **int** |  | 

## Example

```python
from pokeapiclient.models.pokemon_detail_abilities_inner import PokemonDetailAbilitiesInner

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonDetailAbilitiesInner from a JSON string
pokemon_detail_abilities_inner_instance = PokemonDetailAbilitiesInner.from_json(json)
# print the JSON string representation of the object
print(PokemonDetailAbilitiesInner.to_json())

# convert the object into a dict
pokemon_detail_abilities_inner_dict = pokemon_detail_abilities_inner_instance.to_dict()
# create an instance of PokemonDetailAbilitiesInner from a dict
pokemon_detail_abilities_inner_from_dict = PokemonDetailAbilitiesInner.from_dict(pokemon_detail_abilities_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


