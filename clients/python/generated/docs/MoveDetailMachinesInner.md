# MoveDetailMachinesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**machine** | [**MoveDetailMachinesInnerMachine**](MoveDetailMachinesInnerMachine.md) |  | 
**version_group** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.move_detail_machines_inner import MoveDetailMachinesInner

# TODO update the JSON string below
json = "{}"
# create an instance of MoveDetailMachinesInner from a JSON string
move_detail_machines_inner_instance = MoveDetailMachinesInner.from_json(json)
# print the JSON string representation of the object
print(MoveDetailMachinesInner.to_json())

# convert the object into a dict
move_detail_machines_inner_dict = move_detail_machines_inner_instance.to_dict()
# create an instance of MoveDetailMachinesInner from a dict
move_detail_machines_inner_from_dict = MoveDetailMachinesInner.from_dict(move_detail_machines_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


