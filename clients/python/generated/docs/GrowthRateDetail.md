# GrowthRateDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**formula** | **str** |  | 
**descriptions** | [**List[GrowthRateDescription]**](GrowthRateDescription.md) |  | 
**levels** | [**List[Experience]**](Experience.md) |  | 
**pokemon_species** | [**List[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) |  | 

## Example

```python
from pokeapiclient.models.growth_rate_detail import GrowthRateDetail

# TODO update the JSON string below
json = "{}"
# create an instance of GrowthRateDetail from a JSON string
growth_rate_detail_instance = GrowthRateDetail.from_json(json)
# print the JSON string representation of the object
print(GrowthRateDetail.to_json())

# convert the object into a dict
growth_rate_detail_dict = growth_rate_detail_instance.to_dict()
# create an instance of GrowthRateDetail from a dict
growth_rate_detail_from_dict = GrowthRateDetail.from_dict(growth_rate_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


