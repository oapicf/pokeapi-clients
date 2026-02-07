# PokemonHabitatName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_habitat_name import PokemonHabitatName

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonHabitatName from a JSON string
pokemon_habitat_name_instance = PokemonHabitatName.from_json(json)
# print the JSON string representation of the object
print(PokemonHabitatName.to_json())

# convert the object into a dict
pokemon_habitat_name_dict = pokemon_habitat_name_instance.to_dict()
# create an instance of PokemonHabitatName from a dict
pokemon_habitat_name_from_dict = PokemonHabitatName.from_dict(pokemon_habitat_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


