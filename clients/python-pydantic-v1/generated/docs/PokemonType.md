# PokemonType


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**slot** | **int** | The order the Pokémon&#39;s types are listed in. | 
**type** | [**TypeSummary**](TypeSummary.md) | The type the referenced Pokémon has. | 

## Example

```python
from openapi_client.models.pokemon_type import PokemonType

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonType from a JSON string
pokemon_type_instance = PokemonType.from_json(json)
# print the JSON string representation of the object
print PokemonType.to_json()

# convert the object into a dict
pokemon_type_dict = pokemon_type_instance.to_dict()
# create an instance of PokemonType from a dict
pokemon_type_from_dict = PokemonType.from_dict(pokemon_type_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


