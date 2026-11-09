# PokemonPastAbility


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**abilities** | [**List[PokemonAbilityPast]**](PokemonAbilityPast.md) | The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty. | 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced pokémon had the listed abilities. | 

## Example

```python
from openapi_client.models.pokemon_past_ability import PokemonPastAbility

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonPastAbility from a JSON string
pokemon_past_ability_instance = PokemonPastAbility.from_json(json)
# print the JSON string representation of the object
print PokemonPastAbility.to_json()

# convert the object into a dict
pokemon_past_ability_dict = pokemon_past_ability_instance.to_dict()
# create an instance of PokemonPastAbility from a dict
pokemon_past_ability_from_dict = PokemonPastAbility.from_dict(pokemon_past_ability_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


