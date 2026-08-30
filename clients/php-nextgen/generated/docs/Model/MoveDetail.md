# MoveDetail

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
**contest_combos** | [**\OpenAPI\Client\Model\MoveDetailContestCombos**](MoveDetailContestCombos.md) |  |
**contest_type** | [**\OpenAPI\Client\Model\ContestTypeSummary**](ContestTypeSummary.md) |  |
**contest_effect** | [**\OpenAPI\Client\Model\ContestEffectSummary**](ContestEffectSummary.md) |  |
**damage_class** | [**\OpenAPI\Client\Model\MoveDamageClassSummary**](MoveDamageClassSummary.md) |  |
**effect_entries** | [**\OpenAPI\Client\Model\MoveChangeEffectEntriesInner[]**](MoveChangeEffectEntriesInner.md) |  | [readonly]
**effect_changes** | [**\OpenAPI\Client\Model\MoveDetailEffectChangesInner[]**](MoveDetailEffectChangesInner.md) |  | [readonly]
**generation** | [**\OpenAPI\Client\Model\GenerationSummary**](GenerationSummary.md) |  |
**meta** | [**\OpenAPI\Client\Model\MoveMeta**](MoveMeta.md) |  | [readonly]
**names** | [**\OpenAPI\Client\Model\MoveName[]**](MoveName.md) |  | [readonly]
**past_values** | [**\OpenAPI\Client\Model\MoveChange[]**](MoveChange.md) |  | [readonly]
**stat_changes** | [**\OpenAPI\Client\Model\MoveDetailStatChangesInner[]**](MoveDetailStatChangesInner.md) |  | [readonly]
**super_contest_effect** | [**\OpenAPI\Client\Model\SuperContestEffectSummary**](SuperContestEffectSummary.md) |  |
**target** | [**\OpenAPI\Client\Model\MoveTargetSummary**](MoveTargetSummary.md) |  |
**type** | [**\OpenAPI\Client\Model\TypeSummary**](TypeSummary.md) |  |
**machines** | [**\OpenAPI\Client\Model\MoveDetailMachinesInner[]**](MoveDetailMachinesInner.md) |  | [readonly]
**flavor_text_entries** | [**\OpenAPI\Client\Model\MoveFlavorText[]**](MoveFlavorText.md) |  | [readonly]
**learned_by_pokemon** | [**\OpenAPI\Client\Model\AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
