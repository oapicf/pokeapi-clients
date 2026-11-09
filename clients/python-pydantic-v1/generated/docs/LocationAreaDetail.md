# LocationAreaDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**game_index** | **int** | The internal id of an API resource within game data. | 
**encounter_method_rates** | [**List[LocationAreaEncounterRate]**](LocationAreaEncounterRate.md) | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. | [readonly] 
**location** | [**LocationSummary**](LocationSummary.md) | The region this location area can be found in. | 
**names** | [**List[LocationAreaName]**](LocationAreaName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon_encounters** | [**List[LocationAreaPokemonEncounter]**](LocationAreaPokemonEncounter.md) | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. | [readonly] 

## Example

```python
from openapi_client.models.location_area_detail import LocationAreaDetail

# TODO update the JSON string below
json = "{}"
# create an instance of LocationAreaDetail from a JSON string
location_area_detail_instance = LocationAreaDetail.from_json(json)
# print the JSON string representation of the object
print LocationAreaDetail.to_json()

# convert the object into a dict
location_area_detail_dict = location_area_detail_instance.to_dict()
# create an instance of LocationAreaDetail from a dict
location_area_detail_from_dict = LocationAreaDetail.from_dict(location_area_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


