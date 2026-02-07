# PokemonDetailPastAbilitiesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**abilities** | [**List[PokemonDetailAbilitiesInner]**](PokemonDetailAbilitiesInner.md) |  | 
**generation** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_detail_past_abilities_inner import PokemonDetailPastAbilitiesInner

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonDetailPastAbilitiesInner from a JSON string
pokemon_detail_past_abilities_inner_instance = PokemonDetailPastAbilitiesInner.from_json(json)
# print the JSON string representation of the object
print(PokemonDetailPastAbilitiesInner.to_json())

# convert the object into a dict
pokemon_detail_past_abilities_inner_dict = pokemon_detail_past_abilities_inner_instance.to_dict()
# create an instance of PokemonDetailPastAbilitiesInner from a dict
pokemon_detail_past_abilities_inner_from_dict = PokemonDetailPastAbilitiesInner.from_dict(pokemon_detail_past_abilities_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


