# PokeathlonStatDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**affecting_natures** | [**PokeathlonStatAffectingNatures**](PokeathlonStatAffectingNatures.md) | A detail of natures which affect this Pokéathlon stat positively or negatively. | [readonly] 
**names** | [**List[PokeathlonStatName]**](PokeathlonStatName.md) | The name of this resource listed in different languages. | [readonly] 

## Example

```python
from openapi_client.models.pokeathlon_stat_detail import PokeathlonStatDetail

# TODO update the JSON string below
json = "{}"
# create an instance of PokeathlonStatDetail from a JSON string
pokeathlon_stat_detail_instance = PokeathlonStatDetail.from_json(json)
# print the JSON string representation of the object
print PokeathlonStatDetail.to_json()

# convert the object into a dict
pokeathlon_stat_detail_dict = pokeathlon_stat_detail_instance.to_dict()
# create an instance of PokeathlonStatDetail from a dict
pokeathlon_stat_detail_from_dict = PokeathlonStatDetail.from_dict(pokeathlon_stat_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


