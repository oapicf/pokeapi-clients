# PokeathlonStatName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.pokeathlon_stat_name import PokeathlonStatName

# TODO update the JSON string below
json = "{}"
# create an instance of PokeathlonStatName from a JSON string
pokeathlon_stat_name_instance = PokeathlonStatName.from_json(json)
# print the JSON string representation of the object
print(PokeathlonStatName.to_json())

# convert the object into a dict
pokeathlon_stat_name_dict = pokeathlon_stat_name_instance.to_dict()
# create an instance of PokeathlonStatName from a dict
pokeathlon_stat_name_from_dict = PokeathlonStatName.from_dict(pokeathlon_stat_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


