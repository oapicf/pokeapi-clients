# MoveLearnMethodSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.move_learn_method_summary import MoveLearnMethodSummary

# TODO update the JSON string below
json = "{}"
# create an instance of MoveLearnMethodSummary from a JSON string
move_learn_method_summary_instance = MoveLearnMethodSummary.from_json(json)
# print the JSON string representation of the object
print(MoveLearnMethodSummary.to_json())

# convert the object into a dict
move_learn_method_summary_dict = move_learn_method_summary_instance.to_dict()
# create an instance of MoveLearnMethodSummary from a dict
move_learn_method_summary_from_dict = MoveLearnMethodSummary.from_dict(move_learn_method_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


