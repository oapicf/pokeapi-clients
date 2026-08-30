# MoveDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** |  | [readonly] 
**name** | **String** |  | 
**accuracy** | **i32** |  | [optional] [default to None]
**effect_chance** | **i32** |  | 
**pp** | **i32** |  | [optional] [default to None]
**priority** | **i32** |  | [optional] [default to None]
**power** | **i32** |  | [optional] [default to None]
**contest_combos** | [***models::MoveDetailContestCombos**](MoveDetail_contest_combos.md) |  | 
**contest_type** | [***models::ContestTypeSummary**](ContestTypeSummary.md) |  | 
**contest_effect** | [***models::ContestEffectSummary**](ContestEffectSummary.md) |  | 
**damage_class** | [***models::MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**effect_entries** | [**Vec<models::MoveChangeEffectEntriesInner>**](MoveChange_effect_entries_inner.md) |  | [readonly] 
**effect_changes** | [**Vec<models::MoveDetailEffectChangesInner>**](MoveDetail_effect_changes_inner.md) |  | [readonly] 
**generation** | [***models::GenerationSummary**](GenerationSummary.md) |  | 
**meta** | [***models::MoveMeta**](MoveMeta.md) |  | [readonly] 
**names** | [**Vec<models::MoveName>**](MoveName.md) |  | [readonly] 
**past_values** | [**Vec<models::MoveChange>**](MoveChange.md) |  | [readonly] 
**stat_changes** | [**Vec<models::MoveDetailStatChangesInner>**](MoveDetail_stat_changes_inner.md) |  | [readonly] 
**super_contest_effect** | [***models::SuperContestEffectSummary**](SuperContestEffectSummary.md) |  | 
**target** | [***models::MoveTargetSummary**](MoveTargetSummary.md) |  | 
**r#type** | [***models::TypeSummary**](TypeSummary.md) |  | 
**machines** | [**Vec<models::MoveDetailMachinesInner>**](MoveDetail_machines_inner.md) |  | [readonly] 
**flavor_text_entries** | [**Vec<models::MoveFlavorText>**](MoveFlavorText.md) |  | [readonly] 
**learned_by_pokemon** | [**Vec<models::AbilityDetailPokemonInnerPokemon>**](AbilityDetail_pokemon_inner_pokemon.md) |  | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


