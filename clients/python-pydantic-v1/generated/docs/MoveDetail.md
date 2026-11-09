# MoveDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**accuracy** | **int** | The percent value of how likely this move is to be successful. | [optional] 
**effect_chance** | **int** | The percent value of how likely it is this moves effect will happen. | 
**pp** | **int** | Power points. The number of times this move can be used. | [optional] 
**priority** | **int** | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. | [optional] 
**power** | **int** | The base power of this move, or null if it has no fixed base power. | [optional] 
**contest_combos** | [**MoveCombos**](MoveCombos.md) | A detail of normal and super contest combos that require this move. | [readonly] 
**contest_type** | [**ContestTypeSummary**](ContestTypeSummary.md) | The type of appeal this move gives a Pokémon when used in a contest. | 
**contest_effect** | [**ContestEffectSummary**](ContestEffectSummary.md) | The effect the move has when used in a contest. | 
**damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The type of damage the move inflicts on the target, e.g. physical. | 
**effect_entries** | [**List[MoveEffectEffectText]**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] 
**effect_changes** | [**List[MoveEffectChange]**](MoveEffectChange.md) | The list of previous effects this move has had across version groups of the games. | [readonly] 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation in which this move was introduced. | 
**meta** | [**MoveMeta**](MoveMeta.md) | Metadata about this move | [readonly] 
**names** | [**List[MoveName]**](MoveName.md) | The name of this resource listed in different languages. | [readonly] 
**past_values** | [**List[MoveChange]**](MoveChange.md) | A list of move resource value changes across version groups of the game. | [readonly] 
**stat_changes** | [**List[MoveMetaStatChange]**](MoveMetaStatChange.md) | A list of stats this moves effects and how much it effects them. | [readonly] 
**super_contest_effect** | [**SuperContestEffectSummary**](SuperContestEffectSummary.md) | The effect the move has when used in a super contest. | 
**target** | [**MoveTargetSummary**](MoveTargetSummary.md) | The type of target that will receive the effects of the attack. | 
**type** | [**TypeSummary**](TypeSummary.md) | The elemental type of this move. | 
**machines** | [**List[ItemMachine]**](ItemMachine.md) | A list of the machines that teach this move. | [readonly] 
**flavor_text_entries** | [**List[MoveFlavorText]**](MoveFlavorText.md) | The flavor text of this move listed in different languages. | [readonly] 
**learned_by_pokemon** | [**List[PokemonSummary]**](PokemonSummary.md) | List of Pokemon that can learn the move | [readonly] 

## Example

```python
from openapi_client.models.move_detail import MoveDetail

# TODO update the JSON string below
json = "{}"
# create an instance of MoveDetail from a JSON string
move_detail_instance = MoveDetail.from_json(json)
# print the JSON string representation of the object
print MoveDetail.to_json()

# convert the object into a dict
move_detail_dict = move_detail_instance.to_dict()
# create an instance of MoveDetail from a dict
move_detail_from_dict = MoveDetail.from_dict(move_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


