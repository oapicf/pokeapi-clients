# MoveComboUsage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**use_before** | [**List[MoveSummary]**](MoveSummary.md) | A list of moves to use before this move. | 
**use_after** | [**List[MoveSummary]**](MoveSummary.md) | A list of moves to use after this move. | 

## Example

```python
from pokeapiclient.models.move_combo_usage import MoveComboUsage

# TODO update the JSON string below
json = "{}"
# create an instance of MoveComboUsage from a JSON string
move_combo_usage_instance = MoveComboUsage.from_json(json)
# print the JSON string representation of the object
print(MoveComboUsage.to_json())

# convert the object into a dict
move_combo_usage_dict = move_combo_usage_instance.to_dict()
# create an instance of MoveComboUsage from a dict
move_combo_usage_from_dict = MoveComboUsage.from_dict(move_combo_usage_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


