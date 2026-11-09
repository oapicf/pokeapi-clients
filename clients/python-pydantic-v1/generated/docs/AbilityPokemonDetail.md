# AbilityPokemonDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_hidden** | **bool** | Whether or not this a hidden ability for the referenced Pokémon. | [optional] 
**slot** | **int** | Pokémon have 3 ability &#39;slots&#39; which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon. | 
**pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon this ability could belong to. | 

## Example

```python
from openapi_client.models.ability_pokemon_detail import AbilityPokemonDetail

# TODO update the JSON string below
json = "{}"
# create an instance of AbilityPokemonDetail from a JSON string
ability_pokemon_detail_instance = AbilityPokemonDetail.from_json(json)
# print the JSON string representation of the object
print AbilityPokemonDetail.to_json()

# convert the object into a dict
ability_pokemon_detail_dict = ability_pokemon_detail_instance.to_dict()
# create an instance of AbilityPokemonDetail from a dict
ability_pokemon_detail_from_dict = AbilityPokemonDetail.from_dict(ability_pokemon_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


