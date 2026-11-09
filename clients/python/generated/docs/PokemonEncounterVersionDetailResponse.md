# PokemonEncounterVersionDetailResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**VersionSummary**](VersionSummary.md) | The game version this encounter happens in. | 
**max_chance** | **int** | The total percentage of all encounter potential. | 
**encounter_details** | [**List[PokemonEncounterDetailResponse]**](PokemonEncounterDetailResponse.md) | A list of encounters and their specifics. | 

## Example

```python
from pokeapiclient.models.pokemon_encounter_version_detail_response import PokemonEncounterVersionDetailResponse

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonEncounterVersionDetailResponse from a JSON string
pokemon_encounter_version_detail_response_instance = PokemonEncounterVersionDetailResponse.from_json(json)
# print the JSON string representation of the object
print(PokemonEncounterVersionDetailResponse.to_json())

# convert the object into a dict
pokemon_encounter_version_detail_response_dict = pokemon_encounter_version_detail_response_instance.to_dict()
# create an instance of PokemonEncounterVersionDetailResponse from a dict
pokemon_encounter_version_detail_response_from_dict = PokemonEncounterVersionDetailResponse.from_dict(pokemon_encounter_version_detail_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


