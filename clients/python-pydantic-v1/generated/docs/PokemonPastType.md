# PokemonPastType


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**generation** | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced pokémon had the listed types. | 
**types** | [**List[PokemonType]**](PokemonType.md) | The types the referenced pokémon had up to and including the listed generation. | 

## Example

```python
from openapi_client.models.pokemon_past_type import PokemonPastType

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonPastType from a JSON string
pokemon_past_type_instance = PokemonPastType.from_json(json)
# print the JSON string representation of the object
print PokemonPastType.to_json()

# convert the object into a dict
pokemon_past_type_dict = pokemon_past_type_instance.to_dict()
# create an instance of PokemonPastType from a dict
pokemon_past_type_from_dict = PokemonPastType.from_dict(pokemon_past_type_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


