# MoveChange


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accuracy** | **int** | The percent value of how likely this move is to be successful. | [optional] 
**power** | **int** | The base power before the listed version group, or null if power did not change. | [optional] 
**pp** | **int** | Power points. The number of times this move can be used. | [optional] 
**effect_chance** | **int** | The percent value of how likely it is this moves effect will take effect. | 
**effect_entries** | [**List[MoveEffectEffectText]**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] 
**type** | [**TypeSummary**](TypeSummary.md) | The elemental type of this move. | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which these move stat values were in effect. | 

## Example

```python
from pokeapiclient.models.move_change import MoveChange

# TODO update the JSON string below
json = "{}"
# create an instance of MoveChange from a JSON string
move_change_instance = MoveChange.from_json(json)
# print the JSON string representation of the object
print(MoveChange.to_json())

# convert the object into a dict
move_change_dict = move_change_instance.to_dict()
# create an instance of MoveChange from a dict
move_change_from_dict = MoveChange.from_dict(move_change_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


