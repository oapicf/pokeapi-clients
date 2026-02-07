# PokemonSpeciesDetailGeneraInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**genus** | **str** |  | 
**language** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_species_detail_genera_inner import PokemonSpeciesDetailGeneraInner

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonSpeciesDetailGeneraInner from a JSON string
pokemon_species_detail_genera_inner_instance = PokemonSpeciesDetailGeneraInner.from_json(json)
# print the JSON string representation of the object
print(PokemonSpeciesDetailGeneraInner.to_json())

# convert the object into a dict
pokemon_species_detail_genera_inner_dict = pokemon_species_detail_genera_inner_instance.to_dict()
# create an instance of PokemonSpeciesDetailGeneraInner from a dict
pokemon_species_detail_genera_inner_from_dict = PokemonSpeciesDetailGeneraInner.from_dict(pokemon_species_detail_genera_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


