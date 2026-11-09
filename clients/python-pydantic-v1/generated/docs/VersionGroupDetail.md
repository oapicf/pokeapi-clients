# VersionGroupDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**order** | **int** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional] 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. | 
**move_learn_methods** | [**List[MoveLearnMethodSummary]**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. | [readonly] 
**pokedexes** | [**List[PokedexSummary]**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. | [readonly] 
**regions** | [**List[RegionSummary]**](RegionSummary.md) | A list of regions that can be visited in this version group. | [readonly] 
**versions** | [**List[VersionSummary]**](VersionSummary.md) | The versions this version group owns. | [readonly] 

## Example

```python
from openapi_client.models.version_group_detail import VersionGroupDetail

# TODO update the JSON string below
json = "{}"
# create an instance of VersionGroupDetail from a JSON string
version_group_detail_instance = VersionGroupDetail.from_json(json)
# print the JSON string representation of the object
print VersionGroupDetail.to_json()

# convert the object into a dict
version_group_detail_dict = version_group_detail_instance.to_dict()
# create an instance of VersionGroupDetail from a dict
version_group_detail_from_dict = VersionGroupDetail.from_dict(version_group_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


