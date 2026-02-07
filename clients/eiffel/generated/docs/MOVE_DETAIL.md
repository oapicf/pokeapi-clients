# MOVE_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** |  | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) |  | [default to null]
**accuracy** | **INTEGER_32** |  | [optional] [default to null]
**effect_chance** | **INTEGER_32** |  | [default to null]
**pp** | **INTEGER_32** |  | [optional] [default to null]
**priority** | **INTEGER_32** |  | [optional] [default to null]
**power** | **INTEGER_32** |  | [optional] [default to null]
**contest_combos** | [**MOVE_DETAIL_CONTEST_COMBOS**](MoveDetail_contest_combos.md) |  | [default to null]
**contest_type** | [**CONTEST_TYPE_SUMMARY**](ContestTypeSummary.md) |  | [default to null]
**contest_effect** | [**CONTEST_EFFECT_SUMMARY**](ContestEffectSummary.md) |  | [default to null]
**damage_class** | [**MOVE_DAMAGE_CLASS_SUMMARY**](MoveDamageClassSummary.md) |  | [default to null]
**effect_entries** | [**LIST [MOVE_CHANGE_EFFECT_ENTRIES_INNER]**](MoveChange_effect_entries_inner.md) |  | [default to null]
**effect_changes** | [**LIST [MOVE_DETAIL_EFFECT_CHANGES_INNER]**](MoveDetail_effect_changes_inner.md) |  | [default to null]
**generation** | [**GENERATION_SUMMARY**](GenerationSummary.md) |  | [default to null]
**meta** | [**MOVE_META**](MoveMeta.md) |  | [readonly] [default to null]
**names** | [**LIST [MOVE_NAME]**](MoveName.md) |  | [default to null]
**past_values** | [**LIST [MOVE_CHANGE]**](MoveChange.md) |  | [default to null]
**stat_changes** | [**LIST [MOVE_DETAIL_STAT_CHANGES_INNER]**](MoveDetail_stat_changes_inner.md) |  | [default to null]
**super_contest_effect** | [**SUPER_CONTEST_EFFECT_SUMMARY**](SuperContestEffectSummary.md) |  | [default to null]
**target** | [**MOVE_TARGET_SUMMARY**](MoveTargetSummary.md) |  | [default to null]
**type** | [**TYPE_SUMMARY**](TypeSummary.md) |  | [default to null]
**machines** | [**LIST [MOVE_DETAIL_MACHINES_INNER]**](MoveDetail_machines_inner.md) |  | [default to null]
**flavor_text_entries** | [**LIST [MOVE_FLAVOR_TEXT]**](MoveFlavorText.md) |  | [default to null]
**learned_by_pokemon** | [**LIST [ABILITY_DETAIL_POKEMON_INNER_POKEMON]**](AbilityDetail_pokemon_inner_pokemon.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


