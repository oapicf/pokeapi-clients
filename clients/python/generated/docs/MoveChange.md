# MoveChange


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accuracy** | **int** |  | [optional] 
**power** | **int** |  | [optional] 
**pp** | **int** |  | [optional] 
**effect_chance** | **int** |  | 
**effect_entries** | [**List[MoveChangeEffectEntriesInner]**](MoveChangeEffectEntriesInner.md) |  | 
**type** | [**TypeSummary**](TypeSummary.md) |  | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 

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


