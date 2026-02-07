# PokemonHabitatSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.pokemon_habitat_summary import PokemonHabitatSummary

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonHabitatSummary from a JSON string
pokemon_habitat_summary_instance = PokemonHabitatSummary.from_json(json)
# print the JSON string representation of the object
print(PokemonHabitatSummary.to_json())

# convert the object into a dict
pokemon_habitat_summary_dict = pokemon_habitat_summary_instance.to_dict()
# create an instance of PokemonHabitatSummary from a dict
pokemon_habitat_summary_from_dict = PokemonHabitatSummary.from_dict(pokemon_habitat_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


