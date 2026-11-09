# GrowthRateDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**formula** | **str** | The formula used to calculate the rate at which the Pokémon species gains level. | 
**descriptions** | [**List[GrowthRateDescription]**](GrowthRateDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] 
**levels** | [**List[Experience]**](Experience.md) | A list of levels and the amount of experienced needed to atain them based on this growth rate. | [readonly] 
**pokemon_species** | [**List[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) | A list of Pokémon species that gain levels at this growth rate. | [readonly] 

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


