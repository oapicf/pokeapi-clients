# VersionGroupDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**order** | **int** |  | [optional] 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**move_learn_methods** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**pokedexes** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**regions** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**versions** | [**List[VersionSummary]**](VersionSummary.md) |  | 

## Example

```python
from pokeapiclient.models.version_group_detail import VersionGroupDetail

# TODO update the JSON string below
json = "{}"
# create an instance of VersionGroupDetail from a JSON string
version_group_detail_instance = VersionGroupDetail.from_json(json)
# print the JSON string representation of the object
print(VersionGroupDetail.to_json())

# convert the object into a dict
version_group_detail_dict = version_group_detail_instance.to_dict()
# create an instance of VersionGroupDetail from a dict
version_group_detail_from_dict = VersionGroupDetail.from_dict(version_group_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


