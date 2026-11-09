# MoveEffectChange


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which the previous effect of this ability originated. | 
**effect_entries** | [**List[MoveEffectChangeEffectText]**](MoveEffectChangeEffectText.md) | The previous effect of this ability listed in different languages. | [readonly] 

## Example

```python
from pokeapiclient.models.move_effect_change import MoveEffectChange

# TODO update the JSON string below
json = "{}"
# create an instance of MoveEffectChange from a JSON string
move_effect_change_instance = MoveEffectChange.from_json(json)
# print the JSON string representation of the object
print(MoveEffectChange.to_json())

# convert the object into a dict
move_effect_change_dict = move_effect_change_instance.to_dict()
# create an instance of MoveEffectChange from a dict
move_effect_change_from_dict = MoveEffectChange.from_dict(move_effect_change_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


