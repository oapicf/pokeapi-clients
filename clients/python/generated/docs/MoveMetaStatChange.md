# MoveMetaStatChange


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**change** | **int** | The amount of change. | 
**stat** | [**StatSummary**](StatSummary.md) | The stat being affected. | 

## Example

```python
from pokeapiclient.models.move_meta_stat_change import MoveMetaStatChange

# TODO update the JSON string below
json = "{}"
# create an instance of MoveMetaStatChange from a JSON string
move_meta_stat_change_instance = MoveMetaStatChange.from_json(json)
# print the JSON string representation of the object
print(MoveMetaStatChange.to_json())

# convert the object into a dict
move_meta_stat_change_dict = move_meta_stat_change_instance.to_dict()
# create an instance of MoveMetaStatChange from a dict
move_meta_stat_change_from_dict = MoveMetaStatChange.from_dict(move_meta_stat_change_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


