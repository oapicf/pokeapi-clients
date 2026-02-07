# PokedexDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.pokedex_description import PokedexDescription

# TODO update the JSON string below
json = "{}"
# create an instance of PokedexDescription from a JSON string
pokedex_description_instance = PokedexDescription.from_json(json)
# print the JSON string representation of the object
print(PokedexDescription.to_json())

# convert the object into a dict
pokedex_description_dict = pokedex_description_instance.to_dict()
# create an instance of PokedexDescription from a dict
pokedex_description_from_dict = PokedexDescription.from_dict(pokedex_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


