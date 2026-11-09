# EggGroupDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**names** | [**List[EggGroupName]**](EggGroupName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon_species** | [**List[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) | A list of all Pokémon species that are members of this egg group. | [readonly] 

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


