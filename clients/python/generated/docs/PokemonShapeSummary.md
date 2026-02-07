# PokemonShapeSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.pokemon_shape_summary import PokemonShapeSummary

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonShapeSummary from a JSON string
pokemon_shape_summary_instance = PokemonShapeSummary.from_json(json)
# print the JSON string representation of the object
print(PokemonShapeSummary.to_json())

# convert the object into a dict
pokemon_shape_summary_dict = pokemon_shape_summary_instance.to_dict()
# create an instance of PokemonShapeSummary from a dict
pokemon_shape_summary_from_dict = PokemonShapeSummary.from_dict(pokemon_shape_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


