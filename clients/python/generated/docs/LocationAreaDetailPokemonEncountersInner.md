# LocationAreaDetailPokemonEncountersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pokemon** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**version_details** | [**List[LocationAreaDetailPokemonEncountersInnerVersionDetailsInner]**](LocationAreaDetailPokemonEncountersInnerVersionDetailsInner.md) |  | 

## Example

```python
from pokeapiclient.models.location_area_detail_pokemon_encounters_inner import LocationAreaDetailPokemonEncountersInner

# TODO update the JSON string below
json = "{}"
# create an instance of LocationAreaDetailPokemonEncountersInner from a JSON string
location_area_detail_pokemon_encounters_inner_instance = LocationAreaDetailPokemonEncountersInner.from_json(json)
# print the JSON string representation of the object
print(LocationAreaDetailPokemonEncountersInner.to_json())

# convert the object into a dict
location_area_detail_pokemon_encounters_inner_dict = location_area_detail_pokemon_encounters_inner_instance.to_dict()
# create an instance of LocationAreaDetailPokemonEncountersInner from a dict
location_area_detail_pokemon_encounters_inner_from_dict = LocationAreaDetailPokemonEncountersInner.from_dict(location_area_detail_pokemon_encounters_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


