# MoveDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Accuracy** | **Int32** | The percent value of how likely this move is to be successful. | [optional] 
**EffectChance** | **Int32** | The percent value of how likely it is this moves effect will happen. | 
**Pp** | **Int32** | Power points. The number of times this move can be used. | [optional] 
**Priority** | **Int32** | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. | [optional] 
**Power** | **Int32** | The base power of this move, or null if it has no fixed base power. | [optional] 
**ContestCombos** | [**MoveCombos**](MoveCombos.md) | A detail of normal and super contest combos that require this move. | [readonly] 
**ContestType** | [**ContestTypeSummary**](ContestTypeSummary.md) | The type of appeal this move gives a Pokémon when used in a contest. | 
**ContestEffect** | [**ContestEffectSummary**](ContestEffectSummary.md) | The effect the move has when used in a contest. | 
**DamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The type of damage the move inflicts on the target, e.g. physical. | 
**EffectEntries** | [**MoveEffectEffectText[]**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] 
**EffectChanges** | [**MoveEffectChange[]**](MoveEffectChange.md) | The list of previous effects this move has had across version groups of the games. | [readonly] 
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The generation in which this move was introduced. | 
**Meta** | [**MoveMeta**](MoveMeta.md) | Metadata about this move | [readonly] 
**Names** | [**MoveName[]**](MoveName.md) | The name of this resource listed in different languages. | [readonly] 
**PastValues** | [**MoveChange[]**](MoveChange.md) | A list of move resource value changes across version groups of the game. | [readonly] 
**StatChanges** | [**MoveMetaStatChange[]**](MoveMetaStatChange.md) | A list of stats this moves effects and how much it effects them. | [readonly] 
**SuperContestEffect** | [**SuperContestEffectSummary**](SuperContestEffectSummary.md) | The effect the move has when used in a super contest. | 
**Target** | [**MoveTargetSummary**](MoveTargetSummary.md) | The type of target that will receive the effects of the attack. | 
**Type** | [**TypeSummary**](TypeSummary.md) | The elemental type of this move. | 
**Machines** | [**ItemMachine[]**](ItemMachine.md) | A list of the machines that teach this move. | [readonly] 
**FlavorTextEntries** | [**MoveFlavorText[]**](MoveFlavorText.md) | The flavor text of this move listed in different languages. | [readonly] 
**LearnedByPokemon** | [**PokemonSummary[]**](PokemonSummary.md) | List of Pokemon that can learn the move | [readonly] 

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

