# MoveDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | The identifier for this resource. | [readonly] [default to null]
**name** | **String!** | The name for this resource. | [default to null]
**accuracy** | **Int** | The percent value of how likely this move is to be successful. | [optional] [default to null]
**effectChance** | **Int** | The percent value of how likely it is this moves effect will happen. | [default to null]
**pp** | **Int** | Power points. The number of times this move can be used. | [optional] [default to null]
**priority** | **Int** | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. | [optional] [default to null]
**power** | **Int** | The base power of this move, or null if it has no fixed base power. | [optional] [default to null]
**contestCombos** | [***MoveCombos**](MoveCombos.md) | A detail of normal and super contest combos that require this move. | [readonly] [default to null]
**contestType** | [***ContestTypeSummary**](ContestTypeSummary.md) | The type of appeal this move gives a Pokémon when used in a contest. | [default to null]
**contestEffect** | [***ContestEffectSummary**](ContestEffectSummary.md) | The effect the move has when used in a contest. | [default to null]
**damageClass** | [***MoveDamageClassSummary**](MoveDamageClassSummary.md) | The type of damage the move inflicts on the target, e.g. physical. | [default to null]
**effectEntries** | [**MoveEffectEffectText**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] [default to null]
**effectChanges** | [**MoveEffectChange**](MoveEffectChange.md) | The list of previous effects this move has had across version groups of the games. | [readonly] [default to null]
**generation** | [***GenerationSummary**](GenerationSummary.md) | The generation in which this move was introduced. | [default to null]
**meta** | [***MoveMeta**](MoveMeta.md) | Metadata about this move | [readonly] [default to null]
**names** | [**MoveName**](MoveName.md) | The name of this resource listed in different languages. | [readonly] [default to null]
**pastValues** | [**MoveChange**](MoveChange.md) | A list of move resource value changes across version groups of the game. | [readonly] [default to null]
**statChanges** | [**MoveMetaStatChange**](MoveMetaStatChange.md) | A list of stats this moves effects and how much it effects them. | [readonly] [default to null]
**superContestEffect** | [***SuperContestEffectSummary**](SuperContestEffectSummary.md) | The effect the move has when used in a super contest. | [default to null]
**target** | [***MoveTargetSummary**](MoveTargetSummary.md) | The type of target that will receive the effects of the attack. | [default to null]
**Type_** | [***TypeSummary**](TypeSummary.md) | The elemental type of this move. | [default to null]
**machines** | [**ItemMachine**](ItemMachine.md) | A list of the machines that teach this move. | [readonly] [default to null]
**flavorTextEntries** | [**MoveFlavorText**](MoveFlavorText.md) | The flavor text of this move listed in different languages. | [readonly] [default to null]
**learnedByPokemon** | [**PokemonSummary**](PokemonSummary.md) | List of Pokemon that can learn the move | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


