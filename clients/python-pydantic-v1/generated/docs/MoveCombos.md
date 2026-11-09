# MoveCombos


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**normal** | [**MoveComboUsage**](MoveComboUsage.md) | A detail of moves this move can be used before or after, granting additional appeal points in contests. | 
**super** | [**MoveComboUsage**](MoveComboUsage.md) | A detail of moves this move can be used before or after, granting additional appeal points in super contests. | 

## Example

```python
from openapi_client.models.move_combos import MoveCombos

# TODO update the JSON string below
json = "{}"
# create an instance of MoveCombos from a JSON string
move_combos_instance = MoveCombos.from_json(json)
# print the JSON string representation of the object
print MoveCombos.to_json()

# convert the object into a dict
move_combos_dict = move_combos_instance.to_dict()
# create an instance of MoveCombos from a dict
move_combos_from_dict = MoveCombos.from_dict(move_combos_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


