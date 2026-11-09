# MOVE_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**accuracy** | **INTEGER_32** | The percent value of how likely this move is to be successful. | [optional] [default to null]
**effect_chance** | **INTEGER_32** | The percent value of how likely it is this moves effect will happen. | [default to null]
**pp** | **INTEGER_32** | Power points. The number of times this move can be used. | [optional] [default to null]
**priority** | **INTEGER_32** | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. | [optional] [default to null]
**power** | **INTEGER_32** | The base power of this move, or null if it has no fixed base power. | [optional] [default to null]
**contest_combos** | [**MOVE_COMBOS**](MoveCombos.md) | A detail of normal and super contest combos that require this move. | [readonly] [default to null]
**contest_type** | [**CONTEST_TYPE_SUMMARY**](ContestTypeSummary.md) | The type of appeal this move gives a Pokémon when used in a contest. | [default to null]
**contest_effect** | [**CONTEST_EFFECT_SUMMARY**](ContestEffectSummary.md) | The effect the move has when used in a contest. | [default to null]
**damage_class** | [**MOVE_DAMAGE_CLASS_SUMMARY**](MoveDamageClassSummary.md) | The type of damage the move inflicts on the target, e.g. physical. | [default to null]
**effect_entries** | [**LIST [MOVE_EFFECT_EFFECT_TEXT]**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] [default to null]
**effect_changes** | [**LIST [MOVE_EFFECT_CHANGE]**](MoveEffectChange.md) | The list of previous effects this move has had across version groups of the games. | [readonly] [default to null]
**generation** | [**GENERATION_SUMMARY**](GenerationSummary.md) | The generation in which this move was introduced. | [default to null]
**meta** | [**MOVE_META**](MoveMeta.md) | Metadata about this move | [readonly] [default to null]
**names** | [**LIST [MOVE_NAME]**](MoveName.md) | The name of this resource listed in different languages. | [readonly] [default to null]
**past_values** | [**LIST [MOVE_CHANGE]**](MoveChange.md) | A list of move resource value changes across version groups of the game. | [readonly] [default to null]
**stat_changes** | [**LIST [MOVE_META_STAT_CHANGE]**](MoveMetaStatChange.md) | A list of stats this moves effects and how much it effects them. | [readonly] [default to null]
**super_contest_effect** | [**SUPER_CONTEST_EFFECT_SUMMARY**](SuperContestEffectSummary.md) | The effect the move has when used in a super contest. | [default to null]
**target** | [**MOVE_TARGET_SUMMARY**](MoveTargetSummary.md) | The type of target that will receive the effects of the attack. | [default to null]
**type** | [**TYPE_SUMMARY**](TypeSummary.md) | The elemental type of this move. | [default to null]
**machines** | [**LIST [ITEM_MACHINE]**](ItemMachine.md) | A list of the machines that teach this move. | [readonly] [default to null]
**flavor_text_entries** | [**LIST [MOVE_FLAVOR_TEXT]**](MoveFlavorText.md) | The flavor text of this move listed in different languages. | [readonly] [default to null]
**learned_by_pokemon** | [**LIST [POKEMON_SUMMARY]**](PokemonSummary.md) | List of Pokemon that can learn the move | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


