# PokemonSpeciesDetailPalParkEncountersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**area** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**base_score** | **int** |  | 
**rate** | **int** |  | 

## Example

```python
from pokeapiclient.models.pokemon_species_detail_pal_park_encounters_inner import PokemonSpeciesDetailPalParkEncountersInner

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonSpeciesDetailPalParkEncountersInner from a JSON string
pokemon_species_detail_pal_park_encounters_inner_instance = PokemonSpeciesDetailPalParkEncountersInner.from_json(json)
# print the JSON string representation of the object
print(PokemonSpeciesDetailPalParkEncountersInner.to_json())

# convert the object into a dict
pokemon_species_detail_pal_park_encounters_inner_dict = pokemon_species_detail_pal_park_encounters_inner_instance.to_dict()
# create an instance of PokemonSpeciesDetailPalParkEncountersInner from a dict
pokemon_species_detail_pal_park_encounters_inner_from_dict = PokemonSpeciesDetailPalParkEncountersInner.from_dict(pokemon_species_detail_pal_park_encounters_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


