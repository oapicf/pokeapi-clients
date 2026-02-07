# PokemonColorName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_color_name import PokemonColorName

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonColorName from a JSON string
pokemon_color_name_instance = PokemonColorName.from_json(json)
# print the JSON string representation of the object
print(PokemonColorName.to_json())

# convert the object into a dict
pokemon_color_name_dict = pokemon_color_name_instance.to_dict()
# create an instance of PokemonColorName from a dict
pokemon_color_name_from_dict = PokemonColorName.from_dict(pokemon_color_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


