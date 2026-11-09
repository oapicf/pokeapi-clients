# EncounterPokemonDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**min_perfect_ivs** | **int** | The minimum number of perfect IVs, or null if unspecified. | [optional] 
**always_shiny** | **bool** | Whether the encountered Pokémon is always shiny. | [optional] 
**never_shiny** | **bool** | Whether the encountered Pokémon can never be shiny. | [optional] 
**is_alpha** | **bool** | Whether the encountered Pokémon is an alpha Pokémon. | [optional] 

## Example

```python
from openapi_client.models.encounter_pokemon_detail import EncounterPokemonDetail

# TODO update the JSON string below
json = "{}"
# create an instance of EncounterPokemonDetail from a JSON string
encounter_pokemon_detail_instance = EncounterPokemonDetail.from_json(json)
# print the JSON string representation of the object
print EncounterPokemonDetail.to_json()

# convert the object into a dict
encounter_pokemon_detail_dict = encounter_pokemon_detail_instance.to_dict()
# create an instance of EncounterPokemonDetail from a dict
encounter_pokemon_detail_from_dict = EncounterPokemonDetail.from_dict(encounter_pokemon_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


