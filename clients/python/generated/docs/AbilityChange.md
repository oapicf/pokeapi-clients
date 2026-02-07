# AbilityChange


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 
**effect_entries** | [**List[AbilityChangeEffectText]**](AbilityChangeEffectText.md) |  | 

## Example

```python
from pokeapiclient.models.ability_change import AbilityChange

# TODO update the JSON string below
json = "{}"
# create an instance of AbilityChange from a JSON string
ability_change_instance = AbilityChange.from_json(json)
# print the JSON string representation of the object
print(AbilityChange.to_json())

# convert the object into a dict
ability_change_dict = ability_change_instance.to_dict()
# create an instance of AbilityChange from a dict
ability_change_from_dict = AbilityChange.from_dict(ability_change_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


