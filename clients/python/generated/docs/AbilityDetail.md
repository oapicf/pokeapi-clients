# AbilityDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**is_main_series** | **bool** |  | [optional] 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**names** | [**List[AbilityName]**](AbilityName.md) |  | 
**effect_entries** | [**List[AbilityEffectText]**](AbilityEffectText.md) |  | 
**effect_changes** | [**List[AbilityChange]**](AbilityChange.md) |  | 
**flavor_text_entries** | [**List[AbilityFlavorText]**](AbilityFlavorText.md) |  | 
**pokemon** | [**List[AbilityDetailPokemonInner]**](AbilityDetailPokemonInner.md) |  | 

## Example

```python
from pokeapiclient.models.ability_detail import AbilityDetail

# TODO update the JSON string below
json = "{}"
# create an instance of AbilityDetail from a JSON string
ability_detail_instance = AbilityDetail.from_json(json)
# print the JSON string representation of the object
print(AbilityDetail.to_json())

# convert the object into a dict
ability_detail_dict = ability_detail_instance.to_dict()
# create an instance of AbilityDetail from a dict
ability_detail_from_dict = AbilityDetail.from_dict(ability_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


