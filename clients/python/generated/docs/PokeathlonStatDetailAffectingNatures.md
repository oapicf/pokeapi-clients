# PokeathlonStatDetailAffectingNatures


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**decrease** | [**List[PokeathlonStatDetailAffectingNaturesDecreaseInner]**](PokeathlonStatDetailAffectingNaturesDecreaseInner.md) |  | 
**increase** | [**List[PokeathlonStatDetailAffectingNaturesIncreaseInner]**](PokeathlonStatDetailAffectingNaturesIncreaseInner.md) |  | 

## Example

```python
from pokeapiclient.models.pokeathlon_stat_detail_affecting_natures import PokeathlonStatDetailAffectingNatures

# TODO update the JSON string below
json = "{}"
# create an instance of PokeathlonStatDetailAffectingNatures from a JSON string
pokeathlon_stat_detail_affecting_natures_instance = PokeathlonStatDetailAffectingNatures.from_json(json)
# print the JSON string representation of the object
print(PokeathlonStatDetailAffectingNatures.to_json())

# convert the object into a dict
pokeathlon_stat_detail_affecting_natures_dict = pokeathlon_stat_detail_affecting_natures_instance.to_dict()
# create an instance of PokeathlonStatDetailAffectingNatures from a dict
pokeathlon_stat_detail_affecting_natures_from_dict = PokeathlonStatDetailAffectingNatures.from_dict(pokeathlon_stat_detail_affecting_natures_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


