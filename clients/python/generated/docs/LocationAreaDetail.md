# LocationAreaDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**game_index** | **int** |  | 
**encounter_method_rates** | [**List[LocationAreaDetailEncounterMethodRatesInner]**](LocationAreaDetailEncounterMethodRatesInner.md) |  | 
**location** | [**LocationSummary**](LocationSummary.md) |  | 
**names** | [**List[LocationAreaName]**](LocationAreaName.md) |  | 
**pokemon_encounters** | [**List[LocationAreaDetailPokemonEncountersInner]**](LocationAreaDetailPokemonEncountersInner.md) |  | 

## Example

```python
from pokeapiclient.models.location_area_detail import LocationAreaDetail

# TODO update the JSON string below
json = "{}"
# create an instance of LocationAreaDetail from a JSON string
location_area_detail_instance = LocationAreaDetail.from_json(json)
# print the JSON string representation of the object
print(LocationAreaDetail.to_json())

# convert the object into a dict
location_area_detail_dict = location_area_detail_instance.to_dict()
# create an instance of LocationAreaDetail from a dict
location_area_detail_from_dict = LocationAreaDetail.from_dict(location_area_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


