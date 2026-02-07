# LocationAreaDetailPokemonEncountersInnerVersionDetailsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**max_chance** | **int** |  | 
**encounter_details** | [**LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails**](LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.md) |  | 

## Example

```python
from pokeapiclient.models.location_area_detail_pokemon_encounters_inner_version_details_inner import LocationAreaDetailPokemonEncountersInnerVersionDetailsInner

# TODO update the JSON string below
json = "{}"
# create an instance of LocationAreaDetailPokemonEncountersInnerVersionDetailsInner from a JSON string
location_area_detail_pokemon_encounters_inner_version_details_inner_instance = LocationAreaDetailPokemonEncountersInnerVersionDetailsInner.from_json(json)
# print the JSON string representation of the object
print(LocationAreaDetailPokemonEncountersInnerVersionDetailsInner.to_json())

# convert the object into a dict
location_area_detail_pokemon_encounters_inner_version_details_inner_dict = location_area_detail_pokemon_encounters_inner_version_details_inner_instance.to_dict()
# create an instance of LocationAreaDetailPokemonEncountersInnerVersionDetailsInner from a dict
location_area_detail_pokemon_encounters_inner_version_details_inner_from_dict = LocationAreaDetailPokemonEncountersInnerVersionDetailsInner.from_dict(location_area_detail_pokemon_encounters_inner_version_details_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


