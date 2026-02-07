# MoveDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Accuracy** | **Int32** |  | [optional] 
**EffectChance** | **Int32** |  | 
**Pp** | **Int32** |  | [optional] 
**Priority** | **Int32** |  | [optional] 
**Power** | **Int32** |  | [optional] 
**ContestCombos** | [**MoveDetailContestCombos**](MoveDetailContestCombos.md) |  | 
**ContestType** | [**ContestTypeSummary**](ContestTypeSummary.md) |  | 
**ContestEffect** | [**ContestEffectSummary**](ContestEffectSummary.md) |  | 
**DamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**EffectEntries** | [**MoveChangeEffectEntriesInner[]**](MoveChangeEffectEntriesInner.md) |  | 
**EffectChanges** | [**MoveDetailEffectChangesInner[]**](MoveDetailEffectChangesInner.md) |  | 
**Generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**Meta** | [**MoveMeta**](MoveMeta.md) |  | [readonly] 
**Names** | [**MoveName[]**](MoveName.md) |  | 
**PastValues** | [**MoveChange[]**](MoveChange.md) |  | 
**StatChanges** | [**MoveDetailStatChangesInner[]**](MoveDetailStatChangesInner.md) |  | 
**SuperContestEffect** | [**SuperContestEffectSummary**](SuperContestEffectSummary.md) |  | 
**Target** | [**MoveTargetSummary**](MoveTargetSummary.md) |  | 
**Type** | [**TypeSummary**](TypeSummary.md) |  | 
**Machines** | [**MoveDetailMachinesInner[]**](MoveDetailMachinesInner.md) |  | 
**FlavorTextEntries** | [**MoveFlavorText[]**](MoveFlavorText.md) |  | 
**LearnedByPokemon** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$MoveDetail = Initialize-PSOpenAPIToolsMoveDetail  -Id null `
 -Name null `
 -Accuracy null `
 -EffectChance null `
 -Pp null `
 -Priority null `
 -Power null `
 -ContestCombos null `
 -ContestType null `
 -ContestEffect null `
 -DamageClass null `
 -EffectEntries null `
 -EffectChanges null `
 -Generation null `
 -Meta null `
 -Names null `
 -PastValues null `
 -StatChanges null `
 -SuperContestEffect null `
 -Target null `
 -Type null `
 -Machines null `
 -FlavorTextEntries null `
 -LearnedByPokemon null
```

- Convert the resource to JSON
```powershell
$MoveDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

