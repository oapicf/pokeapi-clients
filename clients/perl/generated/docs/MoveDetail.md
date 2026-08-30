# WWW::OpenAPIClient::Object::MoveDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::MoveDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **string** |  | 
**accuracy** | **int** |  | [optional] 
**effect_chance** | **int** |  | 
**pp** | **int** |  | [optional] 
**priority** | **int** |  | [optional] 
**power** | **int** |  | [optional] 
**contest_combos** | [**MoveDetailContestCombos**](MoveDetailContestCombos.md) |  | 
**contest_type** | [**ContestTypeSummary**](ContestTypeSummary.md) |  | 
**contest_effect** | [**ContestEffectSummary**](ContestEffectSummary.md) |  | 
**damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**effect_entries** | [**ARRAY[MoveChangeEffectEntriesInner]**](MoveChangeEffectEntriesInner.md) |  | [readonly] 
**effect_changes** | [**ARRAY[MoveDetailEffectChangesInner]**](MoveDetailEffectChangesInner.md) |  | [readonly] 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**meta** | [**MoveMeta**](MoveMeta.md) |  | [readonly] 
**names** | [**ARRAY[MoveName]**](MoveName.md) |  | [readonly] 
**past_values** | [**ARRAY[MoveChange]**](MoveChange.md) |  | [readonly] 
**stat_changes** | [**ARRAY[MoveDetailStatChangesInner]**](MoveDetailStatChangesInner.md) |  | [readonly] 
**super_contest_effect** | [**SuperContestEffectSummary**](SuperContestEffectSummary.md) |  | 
**target** | [**MoveTargetSummary**](MoveTargetSummary.md) |  | 
**type** | [**TypeSummary**](TypeSummary.md) |  | 
**machines** | [**ARRAY[MoveDetailMachinesInner]**](MoveDetailMachinesInner.md) |  | [readonly] 
**flavor_text_entries** | [**ARRAY[MoveFlavorText]**](MoveFlavorText.md) |  | [readonly] 
**learned_by_pokemon** | [**ARRAY[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


