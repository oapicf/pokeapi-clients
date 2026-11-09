# GenderPokemonSpecies


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rate** | **int** | The chance of this Pokémon being female, in eighths; or -1 for genderless. | 
**pokemon_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | A Pokémon species that can be the referenced gender. | 

## Example

```python
from openapi_client.models.gender_pokemon_species import GenderPokemonSpecies

# TODO update the JSON string below
json = "{}"
# create an instance of GenderPokemonSpecies from a JSON string
gender_pokemon_species_instance = GenderPokemonSpecies.from_json(json)
# print the JSON string representation of the object
print GenderPokemonSpecies.to_json()

# convert the object into a dict
gender_pokemon_species_dict = gender_pokemon_species_instance.to_dict()
# create an instance of GenderPokemonSpecies from a dict
gender_pokemon_species_from_dict = GenderPokemonSpecies.from_dict(gender_pokemon_species_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


