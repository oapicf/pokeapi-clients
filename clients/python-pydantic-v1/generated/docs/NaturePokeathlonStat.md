# NaturePokeathlonStat


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_change** | **int** | The amount of change. | 
**pokeathlon_stat** | [**PokeathlonStatSummary**](PokeathlonStatSummary.md) | The stat being affected. | 

## Example

```python
from openapi_client.models.nature_pokeathlon_stat import NaturePokeathlonStat

# TODO update the JSON string below
json = "{}"
# create an instance of NaturePokeathlonStat from a JSON string
nature_pokeathlon_stat_instance = NaturePokeathlonStat.from_json(json)
# print the JSON string representation of the object
print NaturePokeathlonStat.to_json()

# convert the object into a dict
nature_pokeathlon_stat_dict = nature_pokeathlon_stat_instance.to_dict()
# create an instance of NaturePokeathlonStat from a dict
nature_pokeathlon_stat_from_dict = NaturePokeathlonStat.from_dict(nature_pokeathlon_stat_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


