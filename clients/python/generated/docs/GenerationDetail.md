# GenerationDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**abilities** | [**List[AbilitySummary]**](AbilitySummary.md) |  | 
**main_region** | [**RegionSummary**](RegionSummary.md) |  | 
**moves** | [**List[MoveSummary]**](MoveSummary.md) |  | 
**names** | [**List[GenerationName]**](GenerationName.md) |  | 
**pokemon_species** | [**List[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) |  | 
**types** | [**List[TypeSummary]**](TypeSummary.md) |  | 
**version_groups** | [**List[VersionGroupSummary]**](VersionGroupSummary.md) |  | 

## Example

```python
from pokeapiclient.models.generation_detail import GenerationDetail

# TODO update the JSON string below
json = "{}"
# create an instance of GenerationDetail from a JSON string
generation_detail_instance = GenerationDetail.from_json(json)
# print the JSON string representation of the object
print(GenerationDetail.to_json())

# convert the object into a dict
generation_detail_dict = generation_detail_instance.to_dict()
# create an instance of GenerationDetail from a dict
generation_detail_from_dict = GenerationDetail.from_dict(generation_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


