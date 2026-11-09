# OAIMoveDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | The identifier for this resource. | [readonly] 
**name** | **NSString*** | The name for this resource. | 
**accuracy** | **NSNumber*** | The percent value of how likely this move is to be successful. | [optional] 
**effectChance** | **NSNumber*** | The percent value of how likely it is this moves effect will happen. | 
**pp** | **NSNumber*** | Power points. The number of times this move can be used. | [optional] 
**priority** | **NSNumber*** | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. | [optional] 
**power** | **NSNumber*** | The base power of this move, or null if it has no fixed base power. | [optional] 
**contestCombos** | [**OAIMoveCombos***](OAIMoveCombos.md) | A detail of normal and super contest combos that require this move. | [readonly] 
**contestType** | [**OAIContestTypeSummary***](OAIContestTypeSummary.md) | The type of appeal this move gives a Pokémon when used in a contest. | 
**contestEffect** | [**OAIContestEffectSummary***](OAIContestEffectSummary.md) | The effect the move has when used in a contest. | 
**damageClass** | [**OAIMoveDamageClassSummary***](OAIMoveDamageClassSummary.md) | The type of damage the move inflicts on the target, e.g. physical. | 
**effectEntries** | [**NSArray&lt;OAIMoveEffectEffectText&gt;***](OAIMoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] 
**effectChanges** | [**NSArray&lt;OAIMoveEffectChange&gt;***](OAIMoveEffectChange.md) | The list of previous effects this move has had across version groups of the games. | [readonly] 
**generation** | [**OAIGenerationSummary***](OAIGenerationSummary.md) | The generation in which this move was introduced. | 
**meta** | [**OAIMoveMeta***](OAIMoveMeta.md) | Metadata about this move | [readonly] 
**names** | [**NSArray&lt;OAIMoveName&gt;***](OAIMoveName.md) | The name of this resource listed in different languages. | [readonly] 
**pastValues** | [**NSArray&lt;OAIMoveChange&gt;***](OAIMoveChange.md) | A list of move resource value changes across version groups of the game. | [readonly] 
**statChanges** | [**NSArray&lt;OAIMoveMetaStatChange&gt;***](OAIMoveMetaStatChange.md) | A list of stats this moves effects and how much it effects them. | [readonly] 
**superContestEffect** | [**OAISuperContestEffectSummary***](OAISuperContestEffectSummary.md) | The effect the move has when used in a super contest. | 
**target** | [**OAIMoveTargetSummary***](OAIMoveTargetSummary.md) | The type of target that will receive the effects of the attack. | 
**type** | [**OAITypeSummary***](OAITypeSummary.md) | The elemental type of this move. | 
**machines** | [**NSArray&lt;OAIItemMachine&gt;***](OAIItemMachine.md) | A list of the machines that teach this move. | [readonly] 
**flavorTextEntries** | [**NSArray&lt;OAIMoveFlavorText&gt;***](OAIMoveFlavorText.md) | The flavor text of this move listed in different languages. | [readonly] 
**learnedByPokemon** | [**NSArray&lt;OAIPokemonSummary&gt;***](OAIPokemonSummary.md) | List of Pokemon that can learn the move | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


