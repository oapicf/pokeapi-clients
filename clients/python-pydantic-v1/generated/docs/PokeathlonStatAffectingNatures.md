# PokeathlonStatAffectingNatures


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**increase** | [**List[PokeathlonStatAffectingNature]**](PokeathlonStatAffectingNature.md) | A list of natures and how they change the referenced Pokéathlon stat. | 
**decrease** | [**List[PokeathlonStatAffectingNature]**](PokeathlonStatAffectingNature.md) | A list of natures and how they change the referenced Pokéathlon stat. | 

## Example

```python
from openapi_client.models.pokeathlon_stat_affecting_natures import PokeathlonStatAffectingNatures

# TODO update the JSON string below
json = "{}"
# create an instance of PokeathlonStatAffectingNatures from a JSON string
pokeathlon_stat_affecting_natures_instance = PokeathlonStatAffectingNatures.from_json(json)
# print the JSON string representation of the object
print PokeathlonStatAffectingNatures.to_json()

# convert the object into a dict
pokeathlon_stat_affecting_natures_dict = pokeathlon_stat_affecting_natures_instance.to_dict()
# create an instance of PokeathlonStatAffectingNatures from a dict
pokeathlon_stat_affecting_natures_from_dict = PokeathlonStatAffectingNatures.from_dict(pokeathlon_stat_affecting_natures_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


