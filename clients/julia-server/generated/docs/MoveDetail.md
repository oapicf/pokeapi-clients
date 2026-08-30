# MoveDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** |  | [readonly] [default to nothing]
**`name`** | **`String`** |  | [default to nothing]
**`accuracy`** | **`Int64`** |  | [optional] [default to nothing]
**`effect_chance`** | **`Int64`** |  | [default to nothing]
**`pp`** | **`Int64`** |  | [optional] [default to nothing]
**`priority`** | **`Int64`** |  | [optional] [default to nothing]
**`power`** | **`Int64`** |  | [optional] [default to nothing]
**`contest_combos`** | [**`*MoveDetailContestCombos`**](MoveDetailContestCombos.md) |  | [default to nothing]
**`contest_type`** | [**`*ContestTypeSummary`**](ContestTypeSummary.md) |  | [default to nothing]
**`contest_effect`** | [**`*ContestEffectSummary`**](ContestEffectSummary.md) |  | [default to nothing]
**`damage_class`** | [**`*MoveDamageClassSummary`**](MoveDamageClassSummary.md) |  | [default to nothing]
**`effect_entries`** | [**`Vector{MoveChangeEffectEntriesInner}`**](MoveChangeEffectEntriesInner.md) |  | [readonly] [default to nothing]
**`effect_changes`** | [**`Vector{MoveDetailEffectChangesInner}`**](MoveDetailEffectChangesInner.md) |  | [readonly] [default to nothing]
**`generation`** | [**`*GenerationSummary`**](GenerationSummary.md) |  | [default to nothing]
**`meta`** | [**`*MoveMeta`**](MoveMeta.md) |  | [readonly] [default to nothing]
**`names`** | [**`Vector{MoveName}`**](MoveName.md) |  | [readonly] [default to nothing]
**`past_values`** | [**`Vector{MoveChange}`**](MoveChange.md) |  | [readonly] [default to nothing]
**`stat_changes`** | [**`Vector{MoveDetailStatChangesInner}`**](MoveDetailStatChangesInner.md) |  | [readonly] [default to nothing]
**`super_contest_effect`** | [**`*SuperContestEffectSummary`**](SuperContestEffectSummary.md) |  | [default to nothing]
**`target`** | [**`*MoveTargetSummary`**](MoveTargetSummary.md) |  | [default to nothing]
**`type`** | [**`*TypeSummary`**](TypeSummary.md) |  | [default to nothing]
**`machines`** | [**`Vector{MoveDetailMachinesInner}`**](MoveDetailMachinesInner.md) |  | [readonly] [default to nothing]
**`flavor_text_entries`** | [**`Vector{MoveFlavorText}`**](MoveFlavorText.md) |  | [readonly] [default to nothing]
**`learned_by_pokemon`** | [**`Vector{AbilityDetailPokemonInnerPokemon}`**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


