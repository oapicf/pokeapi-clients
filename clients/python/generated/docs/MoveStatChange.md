# MoveStatChange


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**change** | **int** | The maximum amount of change to the referenced stat. | 
**move** | [**MoveSummary**](MoveSummary.md) | The move causing the change. | 

## Example

```python
from pokeapiclient.models.move_stat_change import MoveStatChange

# TODO update the JSON string below
json = "{}"
# create an instance of MoveStatChange from a JSON string
move_stat_change_instance = MoveStatChange.from_json(json)
# print the JSON string representation of the object
print(MoveStatChange.to_json())

# convert the object into a dict
move_stat_change_dict = move_stat_change_instance.to_dict()
# create an instance of MoveStatChange from a dict
move_stat_change_from_dict = MoveStatChange.from_dict(move_stat_change_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


