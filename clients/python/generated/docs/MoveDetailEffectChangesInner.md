# MoveDetailEffectChangesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effect_entries** | [**List[MoveDetailEffectChangesInnerEffectEntriesInner]**](MoveDetailEffectChangesInnerEffectEntriesInner.md) |  | 
**version_group** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.move_detail_effect_changes_inner import MoveDetailEffectChangesInner

# TODO update the JSON string below
json = "{}"
# create an instance of MoveDetailEffectChangesInner from a JSON string
move_detail_effect_changes_inner_instance = MoveDetailEffectChangesInner.from_json(json)
# print the JSON string representation of the object
print(MoveDetailEffectChangesInner.to_json())

# convert the object into a dict
move_detail_effect_changes_inner_dict = move_detail_effect_changes_inner_instance.to_dict()
# create an instance of MoveDetailEffectChangesInner from a dict
move_detail_effect_changes_inner_from_dict = MoveDetailEffectChangesInner.from_dict(move_detail_effect_changes_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


