# MoveChangeEffectEntriesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effect** | **str** |  | 
**short_effect** | **str** |  | 
**language** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.move_change_effect_entries_inner import MoveChangeEffectEntriesInner

# TODO update the JSON string below
json = "{}"
# create an instance of MoveChangeEffectEntriesInner from a JSON string
move_change_effect_entries_inner_instance = MoveChangeEffectEntriesInner.from_json(json)
# print the JSON string representation of the object
print(MoveChangeEffectEntriesInner.to_json())

# convert the object into a dict
move_change_effect_entries_inner_dict = move_change_effect_entries_inner_instance.to_dict()
# create an instance of MoveChangeEffectEntriesInner from a dict
move_change_effect_entries_inner_from_dict = MoveChangeEffectEntriesInner.from_dict(move_change_effect_entries_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


