# PokemonSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.pokemon_summary import PokemonSummary

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonSummary from a JSON string
pokemon_summary_instance = PokemonSummary.from_json(json)
# print the JSON string representation of the object
print(PokemonSummary.to_json())

# convert the object into a dict
pokemon_summary_dict = pokemon_summary_instance.to_dict()
# create an instance of PokemonSummary from a dict
pokemon_summary_from_dict = PokemonSummary.from_dict(pokemon_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


