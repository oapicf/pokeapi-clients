# MoveDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** |  | [readonly]
**name** | **String** |  | 
**accuracy** | Option<**i32**> |  | [optional]
**effect_chance** | **i32** |  | 
**pp** | Option<**i32**> |  | [optional]
**priority** | Option<**i32**> |  | [optional]
**power** | Option<**i32**> |  | [optional]
**contest_combos** | [**models::MoveDetailContestCombos**](MoveDetail_contest_combos.md) |  | 
**contest_type** | [**models::ContestTypeSummary**](ContestTypeSummary.md) |  | 
**contest_effect** | [**models::ContestEffectSummary**](ContestEffectSummary.md) |  | 
**damage_class** | [**models::MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**effect_entries** | [**Vec<models::MoveChangeEffectEntriesInner>**](MoveChange_effect_entries_inner.md) |  | 
**effect_changes** | [**Vec<models::MoveDetailEffectChangesInner>**](MoveDetail_effect_changes_inner.md) |  | 
**generation** | [**models::GenerationSummary**](GenerationSummary.md) |  | 
**meta** | [**models::MoveMeta**](MoveMeta.md) |  | [readonly]
**names** | [**Vec<models::MoveName>**](MoveName.md) |  | 
**past_values** | [**Vec<models::MoveChange>**](MoveChange.md) |  | 
**stat_changes** | [**Vec<models::MoveDetailStatChangesInner>**](MoveDetail_stat_changes_inner.md) |  | 
**super_contest_effect** | [**models::SuperContestEffectSummary**](SuperContestEffectSummary.md) |  | 
**target** | [**models::MoveTargetSummary**](MoveTargetSummary.md) |  | 
**r#type** | [**models::TypeSummary**](TypeSummary.md) |  | 
**machines** | [**Vec<models::MoveDetailMachinesInner>**](MoveDetail_machines_inner.md) |  | 
**flavor_text_entries** | [**Vec<models::MoveFlavorText>**](MoveFlavorText.md) |  | 
**learned_by_pokemon** | [**Vec<models::AbilityDetailPokemonInnerPokemon>**](AbilityDetail_pokemon_inner_pokemon.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


