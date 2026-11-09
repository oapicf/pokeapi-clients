# PokemonEncounterResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location_area** | [**LocationAreaSummary**](LocationAreaSummary.md) | The location area the referenced Pokémon can be encountered in. | 
**version_details** | [**List[PokemonEncounterVersionDetailResponse]**](PokemonEncounterVersionDetailResponse.md) | A list of versions and encounters with the referenced Pokémon that might happen. | 

## Example

```python
from pokeapiclient.models.pokemon_encounter_response import PokemonEncounterResponse

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonEncounterResponse from a JSON string
pokemon_encounter_response_instance = PokemonEncounterResponse.from_json(json)
# print the JSON string representation of the object
print(PokemonEncounterResponse.to_json())

# convert the object into a dict
pokemon_encounter_response_dict = pokemon_encounter_response_instance.to_dict()
# create an instance of PokemonEncounterResponse from a dict
pokemon_encounter_response_from_dict = PokemonEncounterResponse.from_dict(pokemon_encounter_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


