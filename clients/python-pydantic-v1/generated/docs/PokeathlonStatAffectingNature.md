# PokeathlonStatAffectingNature


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_change** | **int** | The maximum amount of change to the referenced Pokéathlon stat. | 
**nature** | [**NatureSummary**](NatureSummary.md) | The nature causing the change. | 

## Example

```python
from openapi_client.models.pokeathlon_stat_affecting_nature import PokeathlonStatAffectingNature

# TODO update the JSON string below
json = "{}"
# create an instance of PokeathlonStatAffectingNature from a JSON string
pokeathlon_stat_affecting_nature_instance = PokeathlonStatAffectingNature.from_json(json)
# print the JSON string representation of the object
print PokeathlonStatAffectingNature.to_json()

# convert the object into a dict
pokeathlon_stat_affecting_nature_dict = pokeathlon_stat_affecting_nature_instance.to_dict()
# create an instance of PokeathlonStatAffectingNature from a dict
pokeathlon_stat_affecting_nature_from_dict = PokeathlonStatAffectingNature.from_dict(pokeathlon_stat_affecting_nature_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


