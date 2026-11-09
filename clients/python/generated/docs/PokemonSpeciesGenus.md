# PokemonSpeciesGenus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**genus** | **str** | The localized genus for the referenced Pokémon species | 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this genus is in. | 

## Example

```python
from pokeapiclient.models.pokemon_species_genus import PokemonSpeciesGenus

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonSpeciesGenus from a JSON string
pokemon_species_genus_instance = PokemonSpeciesGenus.from_json(json)
# print the JSON string representation of the object
print(PokemonSpeciesGenus.to_json())

# convert the object into a dict
pokemon_species_genus_dict = pokemon_species_genus_instance.to_dict()
# create an instance of PokemonSpeciesGenus from a dict
pokemon_species_genus_from_dict = PokemonSpeciesGenus.from_dict(pokemon_species_genus_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


