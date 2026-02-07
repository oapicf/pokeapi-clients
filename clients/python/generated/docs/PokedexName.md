# PokedexName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.pokedex_name import PokedexName

# TODO update the JSON string below
json = "{}"
# create an instance of PokedexName from a JSON string
pokedex_name_instance = PokedexName.from_json(json)
# print the JSON string representation of the object
print(PokedexName.to_json())

# convert the object into a dict
pokedex_name_dict = pokedex_name_instance.to_dict()
# create an instance of PokedexName from a dict
pokedex_name_from_dict = PokedexName.from_dict(pokedex_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


