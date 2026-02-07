# MoveBattleStyleSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.move_battle_style_summary import MoveBattleStyleSummary

# TODO update the JSON string below
json = "{}"
# create an instance of MoveBattleStyleSummary from a JSON string
move_battle_style_summary_instance = MoveBattleStyleSummary.from_json(json)
# print the JSON string representation of the object
print(MoveBattleStyleSummary.to_json())

# convert the object into a dict
move_battle_style_summary_dict = move_battle_style_summary_instance.to_dict()
# create an instance of MoveBattleStyleSummary from a dict
move_battle_style_summary_from_dict = MoveBattleStyleSummary.from_dict(move_battle_style_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


