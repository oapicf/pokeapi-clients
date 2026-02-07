# LocationAreaDetailEncounterMethodRatesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encounter_method** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**version_details** | [**List[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner]**](LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner.md) |  | 

## Example

```python
from pokeapiclient.models.location_area_detail_encounter_method_rates_inner import LocationAreaDetailEncounterMethodRatesInner

# TODO update the JSON string below
json = "{}"
# create an instance of LocationAreaDetailEncounterMethodRatesInner from a JSON string
location_area_detail_encounter_method_rates_inner_instance = LocationAreaDetailEncounterMethodRatesInner.from_json(json)
# print the JSON string representation of the object
print(LocationAreaDetailEncounterMethodRatesInner.to_json())

# convert the object into a dict
location_area_detail_encounter_method_rates_inner_dict = location_area_detail_encounter_method_rates_inner_instance.to_dict()
# create an instance of LocationAreaDetailEncounterMethodRatesInner from a dict
location_area_detail_encounter_method_rates_inner_from_dict = LocationAreaDetailEncounterMethodRatesInner.from_dict(location_area_detail_encounter_method_rates_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


