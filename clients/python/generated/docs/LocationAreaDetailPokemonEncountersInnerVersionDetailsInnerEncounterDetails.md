# LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**min_level** | **int** |  | 
**max_level** | **int** |  | 
**condition_values** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | [optional] 
**chance** | **int** |  | 
**method** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details import LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails

# TODO update the JSON string below
json = "{}"
# create an instance of LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails from a JSON string
location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_instance = LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.from_json(json)
# print the JSON string representation of the object
print(LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.to_json())

# convert the object into a dict
location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_dict = location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_instance.to_dict()
# create an instance of LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails from a dict
location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_from_dict = LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.from_dict(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


