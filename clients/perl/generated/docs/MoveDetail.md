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
**effect_entries** | [**ARRAY[MoveChangeEffectEntriesInner]**](MoveChangeEffectEntriesInner.md) |  | 
**effect_changes** | [**ARRAY[MoveDetailEffectChangesInner]**](MoveDetailEffectChangesInner.md) |  | 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**meta** | [**MoveMeta**](MoveMeta.md) |  | [readonly] 
**names** | [**ARRAY[MoveName]**](MoveName.md) |  | 
**past_values** | [**ARRAY[MoveChange]**](MoveChange.md) |  | 
**stat_changes** | [**ARRAY[MoveDetailStatChangesInner]**](MoveDetailStatChangesInner.md) |  | 
**super_contest_effect** | [**SuperContestEffectSummary**](SuperContestEffectSummary.md) |  | 
**target** | [**MoveTargetSummary**](MoveTargetSummary.md) |  | 
**type** | [**TypeSummary**](TypeSummary.md) |  | 
**machines** | [**ARRAY[MoveDetailMachinesInner]**](MoveDetailMachinesInner.md) |  | 
**flavor_text_entries** | [**ARRAY[MoveFlavorText]**](MoveFlavorText.md) |  | 
**learned_by_pokemon** | [**ARRAY[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


