# RegionDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**locations** | [**List[LocationSummary]**](LocationSummary.md) | A list of locations that can be found in this region. | [readonly] 
**main_generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this region was introduced in. | [readonly] 
**names** | [**List[RegionName]**](RegionName.md) | The name of this resource listed in different languages. | [readonly] 
**pokedexes** | [**List[PokedexSummary]**](PokedexSummary.md) | A list of pokédexes that catalogue Pokémon in this region. | [readonly] 
**version_groups** | [**List[VersionGroupSummary]**](VersionGroupSummary.md) | A list of version groups where this region can be visited. | [readonly] 

## Example

```python
from openapi_client.models.region_detail import RegionDetail

# TODO update the JSON string below
json = "{}"
# create an instance of RegionDetail from a JSON string
region_detail_instance = RegionDetail.from_json(json)
# print the JSON string representation of the object
print RegionDetail.to_json()

# convert the object into a dict
region_detail_dict = region_detail_instance.to_dict()
# create an instance of RegionDetail from a dict
region_detail_from_dict = RegionDetail.from_dict(region_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


