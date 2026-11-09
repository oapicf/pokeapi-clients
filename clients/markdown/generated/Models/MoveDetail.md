# MoveDetail
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Integer** | The identifier for this resource. | [default to null] |
| **name** | **String** | The name for this resource. | [default to null] |
| **accuracy** | **Integer** | The percent value of how likely this move is to be successful. | [optional] [default to null] |
| **effect\_chance** | **Integer** | The percent value of how likely it is this moves effect will happen. | [default to null] |
| **pp** | **Integer** | Power points. The number of times this move can be used. | [optional] [default to null] |
| **priority** | **Integer** | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. | [optional] [default to null] |
| **power** | **Integer** | The base power of this move, or null if it has no fixed base power. | [optional] [default to null] |
| **contest\_combos** | [**MoveCombos**](MoveCombos.md) | A detail of normal and super contest combos that require this move. | [default to null] |
| **contest\_type** | [**ContestTypeSummary**](ContestTypeSummary.md) | The type of appeal this move gives a Pokémon when used in a contest. | [default to null] |
| **contest\_effect** | [**ContestEffectSummary**](ContestEffectSummary.md) | The effect the move has when used in a contest. | [default to null] |
| **damage\_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The type of damage the move inflicts on the target, e.g. physical. | [default to null] |
| **effect\_entries** | [**List**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [default to null] |
| **effect\_changes** | [**List**](MoveEffectChange.md) | The list of previous effects this move has had across version groups of the games. | [default to null] |
| **generation** | [**GenerationSummary**](GenerationSummary.md) | The generation in which this move was introduced. | [default to null] |
| **meta** | [**MoveMeta**](MoveMeta.md) | Metadata about this move | [default to null] |
| **names** | [**List**](MoveName.md) | The name of this resource listed in different languages. | [default to null] |
| **past\_values** | [**List**](MoveChange.md) | A list of move resource value changes across version groups of the game. | [default to null] |
| **stat\_changes** | [**List**](MoveMetaStatChange.md) | A list of stats this moves effects and how much it effects them. | [default to null] |
| **super\_contest\_effect** | [**SuperContestEffectSummary**](SuperContestEffectSummary.md) | The effect the move has when used in a super contest. | [default to null] |
| **target** | [**MoveTargetSummary**](MoveTargetSummary.md) | The type of target that will receive the effects of the attack. | [default to null] |
| **type** | [**TypeSummary**](TypeSummary.md) | The elemental type of this move. | [default to null] |
| **machines** | [**List**](ItemMachine.md) | A list of the machines that teach this move. | [default to null] |
| **flavor\_text\_entries** | [**List**](MoveFlavorText.md) | The flavor text of this move listed in different languages. | [default to null] |
| **learned\_by\_pokemon** | [**List**](PokemonSummary.md) | List of Pokemon that can learn the move | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

