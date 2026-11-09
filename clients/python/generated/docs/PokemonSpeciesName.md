# PokemonSpeciesName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The localized name for an API resource in a specific language. | 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 

## Example

```python
from pokeapiclient.models.pokemon_species_name import PokemonSpeciesName

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonSpeciesName from a JSON string
pokemon_species_name_instance = PokemonSpeciesName.from_json(json)
# print the JSON string representation of the object
print(PokemonSpeciesName.to_json())

# convert the object into a dict
pokemon_species_name_dict = pokemon_species_name_instance.to_dict()
# create an instance of PokemonSpeciesName from a dict
pokemon_species_name_from_dict = PokemonSpeciesName.from_dict(pokemon_species_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


