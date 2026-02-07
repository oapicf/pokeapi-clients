# MoveDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**accuracy** | **int** |  | [optional] 
**effect_chance** | **int** |  | 
**pp** | **int** |  | [optional] 
**priority** | **int** |  | [optional] 
**power** | **int** |  | [optional] 
**contest_combos** | [**MoveDetailContestCombos**](MoveDetailContestCombos.md) |  | 
**contest_type** | [**ContestTypeSummary**](ContestTypeSummary.md) |  | 
**contest_effect** | [**ContestEffectSummary**](ContestEffectSummary.md) |  | 
**damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**effect_entries** | [**List[MoveChangeEffectEntriesInner]**](MoveChangeEffectEntriesInner.md) |  | 
**effect_changes** | [**List[MoveDetailEffectChangesInner]**](MoveDetailEffectChangesInner.md) |  | 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**meta** | [**MoveMeta**](MoveMeta.md) |  | [readonly] 
**names** | [**List[MoveName]**](MoveName.md) |  | 
**past_values** | [**List[MoveChange]**](MoveChange.md) |  | 
**stat_changes** | [**List[MoveDetailStatChangesInner]**](MoveDetailStatChangesInner.md) |  | 
**super_contest_effect** | [**SuperContestEffectSummary**](SuperContestEffectSummary.md) |  | 
**target** | [**MoveTargetSummary**](MoveTargetSummary.md) |  | 
**type** | [**TypeSummary**](TypeSummary.md) |  | 
**machines** | [**List[MoveDetailMachinesInner]**](MoveDetailMachinesInner.md) |  | 
**flavor_text_entries** | [**List[MoveFlavorText]**](MoveFlavorText.md) |  | 
**learned_by_pokemon** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.move_detail import MoveDetail

# TODO update the JSON string below
json = "{}"
# create an instance of MoveDetail from a JSON string
move_detail_instance = MoveDetail.from_json(json)
# print the JSON string representation of the object
print(MoveDetail.to_json())

# convert the object into a dict
move_detail_dict = move_detail_instance.to_dict()
# create an instance of MoveDetail from a dict
move_detail_from_dict = MoveDetail.from_dict(move_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


