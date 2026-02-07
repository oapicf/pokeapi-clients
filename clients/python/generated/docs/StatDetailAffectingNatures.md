# StatDetailAffectingNatures


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**increase** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**decrease** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.stat_detail_affecting_natures import StatDetailAffectingNatures

# TODO update the JSON string below
json = "{}"
# create an instance of StatDetailAffectingNatures from a JSON string
stat_detail_affecting_natures_instance = StatDetailAffectingNatures.from_json(json)
# print the JSON string representation of the object
print(StatDetailAffectingNatures.to_json())

# convert the object into a dict
stat_detail_affecting_natures_dict = stat_detail_affecting_natures_instance.to_dict()
# create an instance of StatDetailAffectingNatures from a dict
stat_detail_affecting_natures_from_dict = StatDetailAffectingNatures.from_dict(stat_detail_affecting_natures_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


