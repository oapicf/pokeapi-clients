# PokemonShapeAwesomeName


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**awesome_name** | **str** | The localized \&quot;scientific\&quot; name for an API resource in a specific language. | 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this \&quot;scientific\&quot; name is in. | 

## Example

```python
from openapi_client.models.pokemon_shape_awesome_name import PokemonShapeAwesomeName

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonShapeAwesomeName from a JSON string
pokemon_shape_awesome_name_instance = PokemonShapeAwesomeName.from_json(json)
# print the JSON string representation of the object
print PokemonShapeAwesomeName.to_json()

# convert the object into a dict
pokemon_shape_awesome_name_dict = pokemon_shape_awesome_name_instance.to_dict()
# create an instance of PokemonShapeAwesomeName from a dict
pokemon_shape_awesome_name_from_dict = PokemonShapeAwesomeName.from_dict(pokemon_shape_awesome_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


