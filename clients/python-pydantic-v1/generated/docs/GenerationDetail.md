# GenerationDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**abilities** | [**List[AbilitySummary]**](AbilitySummary.md) | A list of abilities that were introduced in this generation. | [readonly] 
**main_region** | [**RegionSummary**](RegionSummary.md) | The main region travelled in this generation. | 
**moves** | [**List[MoveSummary]**](MoveSummary.md) | A list of moves that were introduced in this generation. | [readonly] 
**names** | [**List[GenerationName]**](GenerationName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon_species** | [**List[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) | A list of Pokémon species that were introduced in this generation. | [readonly] 
**types** | [**List[TypeSummary]**](TypeSummary.md) | A list of types that were introduced in this generation. | [readonly] 
**version_groups** | [**List[VersionGroupSummary]**](VersionGroupSummary.md) | A list of version groups that were introduced in this generation. | [readonly] 

## Example

```python
from openapi_client.models.generation_detail import GenerationDetail

# TODO update the JSON string below
json = "{}"
# create an instance of GenerationDetail from a JSON string
generation_detail_instance = GenerationDetail.from_json(json)
# print the JSON string representation of the object
print GenerationDetail.to_json()

# convert the object into a dict
generation_detail_dict = generation_detail_instance.to_dict()
# create an instance of GenerationDetail from a dict
generation_detail_from_dict = GenerationDetail.from_dict(generation_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


