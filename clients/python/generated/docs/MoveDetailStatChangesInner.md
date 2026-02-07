# MoveDetailStatChangesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**change** | **int** |  | 
**stat** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.move_detail_stat_changes_inner import MoveDetailStatChangesInner

# TODO update the JSON string below
json = "{}"
# create an instance of MoveDetailStatChangesInner from a JSON string
move_detail_stat_changes_inner_instance = MoveDetailStatChangesInner.from_json(json)
# print the JSON string representation of the object
print(MoveDetailStatChangesInner.to_json())

# convert the object into a dict
move_detail_stat_changes_inner_dict = move_detail_stat_changes_inner_instance.to_dict()
# create an instance of MoveDetailStatChangesInner from a dict
move_detail_stat_changes_inner_from_dict = MoveDetailStatChangesInner.from_dict(move_detail_stat_changes_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


