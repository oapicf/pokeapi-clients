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
**contest_combos** | [**models::MoveDetailContestCombos**](MoveDetailContestCombos.md) |  | 
**contest_type** | [**models::ContestTypeSummary**](ContestTypeSummary.md) |  | 
**contest_effect** | [**models::ContestEffectSummary**](ContestEffectSummary.md) |  | 
**damage_class** | [**models::MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**effect_entries** | [**Vec<models::MoveChangeEffectEntriesInner>**](MoveChangeEffectEntriesInner.md) |  | [readonly]
**effect_changes** | [**Vec<models::MoveDetailEffectChangesInner>**](MoveDetailEffectChangesInner.md) |  | [readonly]
**generation** | [**models::GenerationSummary**](GenerationSummary.md) |  | 
**meta** | [**models::MoveMeta**](MoveMeta.md) |  | [readonly]
**names** | [**Vec<models::MoveName>**](MoveName.md) |  | [readonly]
**past_values** | [**Vec<models::MoveChange>**](MoveChange.md) |  | [readonly]
**stat_changes** | [**Vec<models::MoveDetailStatChangesInner>**](MoveDetailStatChangesInner.md) |  | [readonly]
**super_contest_effect** | [**models::SuperContestEffectSummary**](SuperContestEffectSummary.md) |  | 
**target** | [**models::MoveTargetSummary**](MoveTargetSummary.md) |  | 
**r#type** | [**models::TypeSummary**](TypeSummary.md) |  | 
**machines** | [**Vec<models::MoveDetailMachinesInner>**](MoveDetailMachinesInner.md) |  | [readonly]
**flavor_text_entries** | [**Vec<models::MoveFlavorText>**](MoveFlavorText.md) |  | [readonly]
**learned_by_pokemon** | [**Vec<models::AbilityDetailPokemonInnerPokemon>**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


