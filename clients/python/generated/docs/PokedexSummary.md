# PokedexSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.pokedex_summary import PokedexSummary

# TODO update the JSON string below
json = "{}"
# create an instance of PokedexSummary from a JSON string
pokedex_summary_instance = PokedexSummary.from_json(json)
# print the JSON string representation of the object
print(PokedexSummary.to_json())

# convert the object into a dict
pokedex_summary_dict = pokedex_summary_instance.to_dict()
# create an instance of PokedexSummary from a dict
pokedex_summary_from_dict = PokedexSummary.from_dict(pokedex_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


