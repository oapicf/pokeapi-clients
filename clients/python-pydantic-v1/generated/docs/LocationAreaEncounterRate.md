# LocationAreaEncounterRate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encounter_method** | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method in which Pokémon may be encountered in an area.. | 
**version_details** | [**List[LocationAreaEncounterVersionDetail]**](LocationAreaEncounterVersionDetail.md) | The chance of the encounter to occur on a version of the game. | 

## Example

```python
from openapi_client.models.location_area_encounter_rate import LocationAreaEncounterRate

# TODO update the JSON string below
json = "{}"
# create an instance of LocationAreaEncounterRate from a JSON string
location_area_encounter_rate_instance = LocationAreaEncounterRate.from_json(json)
# print the JSON string representation of the object
print LocationAreaEncounterRate.to_json()

# convert the object into a dict
location_area_encounter_rate_dict = location_area_encounter_rate_instance.to_dict()
# create an instance of LocationAreaEncounterRate from a dict
location_area_encounter_rate_from_dict = LocationAreaEncounterRate.from_dict(location_area_encounter_rate_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


