# RegionDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**locations** | [**List[LocationSummary]**](LocationSummary.md) |  | 
**main_generation** | [**GenerationSummary**](GenerationSummary.md) |  | [readonly] 
**names** | [**List[RegionName]**](RegionName.md) |  | 
**pokedexes** | [**List[PokedexSummary]**](PokedexSummary.md) |  | 
**version_groups** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.region_detail import RegionDetail

# TODO update the JSON string below
json = "{}"
# create an instance of RegionDetail from a JSON string
region_detail_instance = RegionDetail.from_json(json)
# print the JSON string representation of the object
print(RegionDetail.to_json())

# convert the object into a dict
region_detail_dict = region_detail_instance.to_dict()
# create an instance of RegionDetail from a dict
region_detail_from_dict = RegionDetail.from_dict(region_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


