# LocationAreaEncounterVersionDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rate** | **int** | The chance of an encounter to occur. | 
**version** | [**VersionSummary**](VersionSummary.md) | The version of the game in which the encounter can occur with the given chance. | 

## Example

```python
from pokeapiclient.models.location_area_encounter_version_detail import LocationAreaEncounterVersionDetail

# TODO update the JSON string below
json = "{}"
# create an instance of LocationAreaEncounterVersionDetail from a JSON string
location_area_encounter_version_detail_instance = LocationAreaEncounterVersionDetail.from_json(json)
# print the JSON string representation of the object
print(LocationAreaEncounterVersionDetail.to_json())

# convert the object into a dict
location_area_encounter_version_detail_dict = location_area_encounter_version_detail_instance.to_dict()
# create an instance of LocationAreaEncounterVersionDetail from a dict
location_area_encounter_version_detail_from_dict = LocationAreaEncounterVersionDetail.from_dict(location_area_encounter_version_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


