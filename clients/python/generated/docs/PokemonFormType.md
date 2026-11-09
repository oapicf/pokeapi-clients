# PokemonFormType


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**slot** | **int** | The order the Pokémon&#39;s types are listed in. | 
**type** | [**TypeSummary**](TypeSummary.md) | The type the referenced Form has. | 

## Example

```python
from pokeapiclient.models.pokemon_form_type import PokemonFormType

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonFormType from a JSON string
pokemon_form_type_instance = PokemonFormType.from_json(json)
# print the JSON string representation of the object
print(PokemonFormType.to_json())

# convert the object into a dict
pokemon_form_type_dict = pokemon_form_type_instance.to_dict()
# create an instance of PokemonFormType from a dict
pokemon_form_type_from_dict = PokemonFormType.from_dict(pokemon_form_type_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


