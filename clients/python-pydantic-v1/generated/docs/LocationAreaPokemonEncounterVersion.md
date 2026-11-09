# LocationAreaPokemonEncounterVersion


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**VersionSummary**](VersionSummary.md) | The game version this encounter happens in. | 
**max_chance** | **int** | The total percentage of all encounter potential. | 
**encounter_details** | [**List[LocationAreaEncounterDetail]**](LocationAreaEncounterDetail.md) | A list of encounters and their specifics. | 

## Example

```python
from openapi_client.models.location_area_pokemon_encounter_version import LocationAreaPokemonEncounterVersion

# TODO update the JSON string below
json = "{}"
# create an instance of LocationAreaPokemonEncounterVersion from a JSON string
location_area_pokemon_encounter_version_instance = LocationAreaPokemonEncounterVersion.from_json(json)
# print the JSON string representation of the object
print LocationAreaPokemonEncounterVersion.to_json()

# convert the object into a dict
location_area_pokemon_encounter_version_dict = location_area_pokemon_encounter_version_instance.to_dict()
# create an instance of LocationAreaPokemonEncounterVersion from a dict
location_area_pokemon_encounter_version_from_dict = LocationAreaPokemonEncounterVersion.from_dict(location_area_pokemon_encounter_version_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


