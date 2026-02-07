# PokemonDetailPastTypesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**generation** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**types** | [**List[PokemonDetailTypesInner]**](PokemonDetailTypesInner.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_detail_past_types_inner import PokemonDetailPastTypesInner

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonDetailPastTypesInner from a JSON string
pokemon_detail_past_types_inner_instance = PokemonDetailPastTypesInner.from_json(json)
# print the JSON string representation of the object
print(PokemonDetailPastTypesInner.to_json())

# convert the object into a dict
pokemon_detail_past_types_inner_dict = pokemon_detail_past_types_inner_instance.to_dict()
# create an instance of PokemonDetailPastTypesInner from a dict
pokemon_detail_past_types_inner_from_dict = PokemonDetailPastTypesInner.from_dict(pokemon_detail_past_types_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


