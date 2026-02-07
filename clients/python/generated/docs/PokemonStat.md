# PokemonStat


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**base_stat** | **int** |  | 
**effort** | **int** |  | 
**stat** | [**StatSummary**](StatSummary.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_stat import PokemonStat

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonStat from a JSON string
pokemon_stat_instance = PokemonStat.from_json(json)
# print the JSON string representation of the object
print(PokemonStat.to_json())

# convert the object into a dict
pokemon_stat_dict = pokemon_stat_instance.to_dict()
# create an instance of PokemonStat from a dict
pokemon_stat_from_dict = PokemonStat.from_dict(pokemon_stat_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


