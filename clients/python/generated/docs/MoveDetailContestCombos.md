# MoveDetailContestCombos


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**normal** | [**MoveDetailContestCombosNormal**](MoveDetailContestCombosNormal.md) |  | 
**super** | [**MoveDetailContestCombosNormal**](MoveDetailContestCombosNormal.md) |  | 

## Example

```python
from pokeapiclient.models.move_detail_contest_combos import MoveDetailContestCombos

# TODO update the JSON string below
json = "{}"
# create an instance of MoveDetailContestCombos from a JSON string
move_detail_contest_combos_instance = MoveDetailContestCombos.from_json(json)
# print the JSON string representation of the object
print(MoveDetailContestCombos.to_json())

# convert the object into a dict
move_detail_contest_combos_dict = move_detail_contest_combos_instance.to_dict()
# create an instance of MoveDetailContestCombos from a dict
move_detail_contest_combos_from_dict = MoveDetailContestCombos.from_dict(move_detail_contest_combos_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


