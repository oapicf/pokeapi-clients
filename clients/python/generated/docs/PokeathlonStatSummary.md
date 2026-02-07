# PokeathlonStatSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.pokeathlon_stat_summary import PokeathlonStatSummary

# TODO update the JSON string below
json = "{}"
# create an instance of PokeathlonStatSummary from a JSON string
pokeathlon_stat_summary_instance = PokeathlonStatSummary.from_json(json)
# print the JSON string representation of the object
print(PokeathlonStatSummary.to_json())

# convert the object into a dict
pokeathlon_stat_summary_dict = pokeathlon_stat_summary_instance.to_dict()
# create an instance of PokeathlonStatSummary from a dict
pokeathlon_stat_summary_from_dict = PokeathlonStatSummary.from_dict(pokeathlon_stat_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


