# PokemonSpeciesPalParkEncounter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**base_score** | **int** | The base score given to the player when the referenced Pokémon is caught during a pal park run. | [optional] 
**rate** | **int** | The base rate for encountering the referenced Pokémon in this pal park area. | 
**area** | [**PalParkAreaSummary**](PalParkAreaSummary.md) | The pal park area where this encounter happens. | 

## Example

```python
from pokeapiclient.models.pokemon_species_pal_park_encounter import PokemonSpeciesPalParkEncounter

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonSpeciesPalParkEncounter from a JSON string
pokemon_species_pal_park_encounter_instance = PokemonSpeciesPalParkEncounter.from_json(json)
# print the JSON string representation of the object
print(PokemonSpeciesPalParkEncounter.to_json())

# convert the object into a dict
pokemon_species_pal_park_encounter_dict = pokemon_species_pal_park_encounter_instance.to_dict()
# create an instance of PokemonSpeciesPalParkEncounter from a dict
pokemon_species_pal_park_encounter_from_dict = PokemonSpeciesPalParkEncounter.from_dict(pokemon_species_pal_park_encounter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


