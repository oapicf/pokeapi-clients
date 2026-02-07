# PokemonSpeciesFlavorText


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flavor_text** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 
**version** | [**VersionSummary**](VersionSummary.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_species_flavor_text import PokemonSpeciesFlavorText

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonSpeciesFlavorText from a JSON string
pokemon_species_flavor_text_instance = PokemonSpeciesFlavorText.from_json(json)
# print the JSON string representation of the object
print(PokemonSpeciesFlavorText.to_json())

# convert the object into a dict
pokemon_species_flavor_text_dict = pokemon_species_flavor_text_instance.to_dict()
# create an instance of PokemonSpeciesFlavorText from a dict
pokemon_species_flavor_text_from_dict = PokemonSpeciesFlavorText.from_dict(pokemon_species_flavor_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


