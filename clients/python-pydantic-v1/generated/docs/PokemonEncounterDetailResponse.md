# PokemonEncounterDetailResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chance** | **int** | Percent chance that this encounter will occur. | 
**condition_values** | [**List[EncounterConditionValueSummary]**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | 
**max_level** | **int** | The highest level the Pokémon could be encountered at. | 
**method** | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method by which this encounter happens. | 
**min_level** | **int** | The lowest level the Pokémon could be encountered at. | 

## Example

```python
from openapi_client.models.pokemon_encounter_detail_response import PokemonEncounterDetailResponse

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonEncounterDetailResponse from a JSON string
pokemon_encounter_detail_response_instance = PokemonEncounterDetailResponse.from_json(json)
# print the JSON string representation of the object
print PokemonEncounterDetailResponse.to_json()

# convert the object into a dict
pokemon_encounter_detail_response_dict = pokemon_encounter_detail_response_instance.to_dict()
# create an instance of PokemonEncounterDetailResponse from a dict
pokemon_encounter_detail_response_from_dict = PokemonEncounterDetailResponse.from_dict(pokemon_encounter_detail_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


