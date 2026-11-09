# PalParkEncounter


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**base_score** | **int** | The base score given to the player when this Pokémon is caught during a pal park run. | [optional] 
**rate** | **int** | The base rate for encountering this Pokémon in this pal park area. | 
**pokemon_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species being encountered. | 

## Example

```python
from openapi_client.models.pal_park_encounter import PalParkEncounter

# TODO update the JSON string below
json = "{}"
# create an instance of PalParkEncounter from a JSON string
pal_park_encounter_instance = PalParkEncounter.from_json(json)
# print the JSON string representation of the object
print PalParkEncounter.to_json()

# convert the object into a dict
pal_park_encounter_dict = pal_park_encounter_instance.to_dict()
# create an instance of PalParkEncounter from a dict
pal_park_encounter_from_dict = PalParkEncounter.from_dict(pal_park_encounter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


