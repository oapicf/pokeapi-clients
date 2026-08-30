# openapi::MoveDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** |  | [readonly] 
**name** | **character** |  | [Max. length: 100] 
**accuracy** | **integer** |  | [optional] 
**effect_chance** | **integer** |  | 
**pp** | **integer** |  | [optional] 
**priority** | **integer** |  | [optional] 
**power** | **integer** |  | [optional] 
**contest_combos** | [**MoveDetailContestCombos**](MoveDetail_contest_combos.md) |  | 
**contest_type** | [**ContestTypeSummary**](ContestTypeSummary.md) |  | 
**contest_effect** | [**ContestEffectSummary**](ContestEffectSummary.md) |  | 
**damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**effect_entries** | [**array[MoveChangeEffectEntriesInner]**](MoveChange_effect_entries_inner.md) |  | [readonly] 
**effect_changes** | [**array[MoveDetailEffectChangesInner]**](MoveDetail_effect_changes_inner.md) |  | [readonly] 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**meta** | [**MoveMeta**](MoveMeta.md) |  | [readonly] 
**names** | [**array[MoveName]**](MoveName.md) |  | [readonly] 
**past_values** | [**array[MoveChange]**](MoveChange.md) |  | [readonly] 
**stat_changes** | [**array[MoveDetailStatChangesInner]**](MoveDetail_stat_changes_inner.md) |  | [readonly] 
**super_contest_effect** | [**SuperContestEffectSummary**](SuperContestEffectSummary.md) |  | 
**target** | [**MoveTargetSummary**](MoveTargetSummary.md) |  | 
**type** | [**TypeSummary**](TypeSummary.md) |  | 
**machines** | [**array[MoveDetailMachinesInner]**](MoveDetail_machines_inner.md) |  | [readonly] 
**flavor_text_entries** | [**array[MoveFlavorText]**](MoveFlavorText.md) |  | [readonly] 
**learned_by_pokemon** | [**array[AbilityDetailPokemonInnerPokemon]**](AbilityDetail_pokemon_inner_pokemon.md) |  | [readonly] 


