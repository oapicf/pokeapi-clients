# LocationAreaEncounterDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**min_level** | **int** | The lowest level the Pokémon could be encountered at. | 
**max_level** | **int** | The highest level the Pokémon could be encountered at. | 
**chance** | **int** | Percent chance that this encounter will occur. | [optional] [default to 0]
**method** | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method by which this encounter happens. | [optional] 
**condition_values** | [**List[EncounterConditionValueSummary]**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | [readonly] 
**pokemon_details** | [**EncounterPokemonDetail**](EncounterPokemonDetail.md) | Additional properties of the encountered Pokémon, or null if unspecified. | [readonly] 

## Example

```python
from pokeapiclient.models.location_area_encounter_detail import LocationAreaEncounterDetail

# TODO update the JSON string below
json = "{}"
# create an instance of LocationAreaEncounterDetail from a JSON string
location_area_encounter_detail_instance = LocationAreaEncounterDetail.from_json(json)
# print the JSON string representation of the object
print(LocationAreaEncounterDetail.to_json())

# convert the object into a dict
location_area_encounter_detail_dict = location_area_encounter_detail_instance.to_dict()
# create an instance of LocationAreaEncounterDetail from a dict
location_area_encounter_detail_from_dict = LocationAreaEncounterDetail.from_dict(location_area_encounter_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


