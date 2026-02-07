# PokemonSpeciesSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.pokemon_species_summary import PokemonSpeciesSummary

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonSpeciesSummary from a JSON string
pokemon_species_summary_instance = PokemonSpeciesSummary.from_json(json)
# print the JSON string representation of the object
print(PokemonSpeciesSummary.to_json())

# convert the object into a dict
pokemon_species_summary_dict = pokemon_species_summary_instance.to_dict()
# create an instance of PokemonSpeciesSummary from a dict
pokemon_species_summary_from_dict = PokemonSpeciesSummary.from_dict(pokemon_species_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


