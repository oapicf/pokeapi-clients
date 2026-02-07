# PokemonColorSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.pokemon_color_summary import PokemonColorSummary

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonColorSummary from a JSON string
pokemon_color_summary_instance = PokemonColorSummary.from_json(json)
# print the JSON string representation of the object
print(PokemonColorSummary.to_json())

# convert the object into a dict
pokemon_color_summary_dict = pokemon_color_summary_instance.to_dict()
# create an instance of PokemonColorSummary from a dict
pokemon_color_summary_from_dict = PokemonColorSummary.from_dict(pokemon_color_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


