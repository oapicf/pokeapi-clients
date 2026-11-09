# LocationAreaPokemonEncounter


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon being encountered. | 
**version_details** | [**List[LocationAreaPokemonEncounterVersion]**](LocationAreaPokemonEncounterVersion.md) | A list of versions and encounters with Pokémon that might happen in the referenced location area. | 

## Example

```python
from openapi_client.models.location_area_pokemon_encounter import LocationAreaPokemonEncounter

# TODO update the JSON string below
json = "{}"
# create an instance of LocationAreaPokemonEncounter from a JSON string
location_area_pokemon_encounter_instance = LocationAreaPokemonEncounter.from_json(json)
# print the JSON string representation of the object
print LocationAreaPokemonEncounter.to_json()

# convert the object into a dict
location_area_pokemon_encounter_dict = location_area_pokemon_encounter_instance.to_dict()
# create an instance of LocationAreaPokemonEncounter from a dict
location_area_pokemon_encounter_from_dict = LocationAreaPokemonEncounter.from_dict(location_area_pokemon_encounter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


