# MoveTargetSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.move_target_summary import MoveTargetSummary

# TODO update the JSON string below
json = "{}"
# create an instance of MoveTargetSummary from a JSON string
move_target_summary_instance = MoveTargetSummary.from_json(json)
# print the JSON string representation of the object
print(MoveTargetSummary.to_json())

# convert the object into a dict
move_target_summary_dict = move_target_summary_instance.to_dict()
# create an instance of MoveTargetSummary from a dict
move_target_summary_from_dict = MoveTargetSummary.from_dict(move_target_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


