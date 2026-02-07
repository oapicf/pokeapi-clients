# EggGroupDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**names** | [**List[EggGroupName]**](EggGroupName.md) |  | 
**pokemon_species** | [**List[EggGroupDetailPokemonSpeciesInner]**](EggGroupDetailPokemonSpeciesInner.md) |  | 

## Example

```python
from pokeapiclient.models.egg_group_detail import EggGroupDetail

# TODO update the JSON string below
json = "{}"
# create an instance of EggGroupDetail from a JSON string
egg_group_detail_instance = EggGroupDetail.from_json(json)
# print the JSON string representation of the object
print(EggGroupDetail.to_json())

# convert the object into a dict
egg_group_detail_dict = egg_group_detail_instance.to_dict()
# create an instance of EggGroupDetail from a dict
egg_group_detail_from_dict = EggGroupDetail.from_dict(egg_group_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


