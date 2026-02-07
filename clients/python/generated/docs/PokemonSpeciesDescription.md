# PokemonSpeciesDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_species_description import PokemonSpeciesDescription

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonSpeciesDescription from a JSON string
pokemon_species_description_instance = PokemonSpeciesDescription.from_json(json)
# print the JSON string representation of the object
print(PokemonSpeciesDescription.to_json())

# convert the object into a dict
pokemon_species_description_dict = pokemon_species_description_instance.to_dict()
# create an instance of PokemonSpeciesDescription from a dict
pokemon_species_description_from_dict = PokemonSpeciesDescription.from_dict(pokemon_species_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


