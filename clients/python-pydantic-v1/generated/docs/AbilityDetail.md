# AbilityDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**is_main_series** | **bool** | Whether or not this ability originated in the main series of the video games. | [optional] 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this ability originated in. | 
**names** | [**List[AbilityName]**](AbilityName.md) | The name of this resource listed in different languages. | [readonly] 
**effect_entries** | [**List[AbilityEffectText]**](AbilityEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**effect_changes** | [**List[AbilityChange]**](AbilityChange.md) | The list of previous effects this ability has had across version groups. | [readonly] 
**flavor_text_entries** | [**List[AbilityFlavorText]**](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**pokemon** | [**List[AbilityPokemonDetail]**](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. | [readonly] 

## Example

```python
from openapi_client.models.ability_detail import AbilityDetail

# TODO update the JSON string below
json = "{}"
# create an instance of AbilityDetail from a JSON string
ability_detail_instance = AbilityDetail.from_json(json)
# print the JSON string representation of the object
print AbilityDetail.to_json()

# convert the object into a dict
ability_detail_dict = ability_detail_instance.to_dict()
# create an instance of AbilityDetail from a dict
ability_detail_from_dict = AbilityDetail.from_dict(ability_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


