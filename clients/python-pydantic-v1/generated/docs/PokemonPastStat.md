# PokemonPastStat


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**generation** | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced pokémon had the listed stats. | 
**stats** | [**List[PokemonStat]**](PokemonStat.md) | The stat the Pokémon had up to and including the listed generation. | 

## Example

```python
from openapi_client.models.pokemon_past_stat import PokemonPastStat

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonPastStat from a JSON string
pokemon_past_stat_instance = PokemonPastStat.from_json(json)
# print the JSON string representation of the object
print PokemonPastStat.to_json()

# convert the object into a dict
pokemon_past_stat_dict = pokemon_past_stat_instance.to_dict()
# create an instance of PokemonPastStat from a dict
pokemon_past_stat_from_dict = PokemonPastStat.from_dict(pokemon_past_stat_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


