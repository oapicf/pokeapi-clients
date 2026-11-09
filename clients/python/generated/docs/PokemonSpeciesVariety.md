# PokemonSpeciesVariety


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_default** | **bool** | Whether this variety is the default variety. | 
**pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon variety. | 

## Example

```python
from pokeapiclient.models.pokemon_species_variety import PokemonSpeciesVariety

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonSpeciesVariety from a JSON string
pokemon_species_variety_instance = PokemonSpeciesVariety.from_json(json)
# print the JSON string representation of the object
print(PokemonSpeciesVariety.to_json())

# convert the object into a dict
pokemon_species_variety_dict = pokemon_species_variety_instance.to_dict()
# create an instance of PokemonSpeciesVariety from a dict
pokemon_species_variety_from_dict = PokemonSpeciesVariety.from_dict(pokemon_species_variety_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


