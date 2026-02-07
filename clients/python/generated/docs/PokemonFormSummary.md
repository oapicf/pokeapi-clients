# PokemonFormSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.pokemon_form_summary import PokemonFormSummary

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonFormSummary from a JSON string
pokemon_form_summary_instance = PokemonFormSummary.from_json(json)
# print the JSON string representation of the object
print(PokemonFormSummary.to_json())

# convert the object into a dict
pokemon_form_summary_dict = pokemon_form_summary_instance.to_dict()
# create an instance of PokemonFormSummary from a dict
pokemon_form_summary_from_dict = PokemonFormSummary.from_dict(pokemon_form_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


