# PalParkAreaDetailPokemonEncountersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**base_score** | **int** |  | 
**pokemon_species** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**rate** | **int** |  | 

## Example

```python
from pokeapiclient.models.pal_park_area_detail_pokemon_encounters_inner import PalParkAreaDetailPokemonEncountersInner

# TODO update the JSON string below
json = "{}"
# create an instance of PalParkAreaDetailPokemonEncountersInner from a JSON string
pal_park_area_detail_pokemon_encounters_inner_instance = PalParkAreaDetailPokemonEncountersInner.from_json(json)
# print the JSON string representation of the object
print(PalParkAreaDetailPokemonEncountersInner.to_json())

# convert the object into a dict
pal_park_area_detail_pokemon_encounters_inner_dict = pal_park_area_detail_pokemon_encounters_inner_instance.to_dict()
# create an instance of PalParkAreaDetailPokemonEncountersInner from a dict
pal_park_area_detail_pokemon_encounters_inner_from_dict = PalParkAreaDetailPokemonEncountersInner.from_dict(pal_park_area_detail_pokemon_encounters_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


