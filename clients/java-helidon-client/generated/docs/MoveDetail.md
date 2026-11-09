

# MoveDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The identifier for this resource. |  [readonly] |
|**name** | **String** | The name for this resource. |  |
|**accuracy** | **Integer** | The percent value of how likely this move is to be successful. |  [optional] |
|**effectChance** | **Integer** | The percent value of how likely it is this moves effect will happen. |  |
|**pp** | **Integer** | Power points. The number of times this move can be used. |  [optional] |
|**priority** | **Integer** | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. |  [optional] |
|**power** | **Integer** | The base power of this move, or null if it has no fixed base power. |  [optional] |
|**contestCombos** | [**MoveCombos**](MoveCombos.md) | A detail of normal and super contest combos that require this move. |  [readonly] |
|**contestType** | [**ContestTypeSummary**](ContestTypeSummary.md) | The type of appeal this move gives a Pokémon when used in a contest. |  |
|**contestEffect** | [**ContestEffectSummary**](ContestEffectSummary.md) | The effect the move has when used in a contest. |  |
|**damageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The type of damage the move inflicts on the target, e.g. physical. |  |
|**effectEntries** | [**List&lt;MoveEffectEffectText&gt;**](MoveEffectEffectText.md) | The effect of this move listed in different languages. |  [readonly] |
|**effectChanges** | [**List&lt;MoveEffectChange&gt;**](MoveEffectChange.md) | The list of previous effects this move has had across version groups of the games. |  [readonly] |
|**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation in which this move was introduced. |  |
|**meta** | [**MoveMeta**](MoveMeta.md) | Metadata about this move |  [readonly] |
|**names** | [**List&lt;MoveName&gt;**](MoveName.md) | The name of this resource listed in different languages. |  [readonly] |
|**pastValues** | [**List&lt;MoveChange&gt;**](MoveChange.md) | A list of move resource value changes across version groups of the game. |  [readonly] |
|**statChanges** | [**List&lt;MoveMetaStatChange&gt;**](MoveMetaStatChange.md) | A list of stats this moves effects and how much it effects them. |  [readonly] |
|**superContestEffect** | [**SuperContestEffectSummary**](SuperContestEffectSummary.md) | The effect the move has when used in a super contest. |  |
|**target** | [**MoveTargetSummary**](MoveTargetSummary.md) | The type of target that will receive the effects of the attack. |  |
|**type** | [**TypeSummary**](TypeSummary.md) | The elemental type of this move. |  |
|**machines** | [**List&lt;ItemMachine&gt;**](ItemMachine.md) | A list of the machines that teach this move. |  [readonly] |
|**flavorTextEntries** | [**List&lt;MoveFlavorText&gt;**](MoveFlavorText.md) | The flavor text of this move listed in different languages. |  [readonly] |
|**learnedByPokemon** | [**List&lt;PokemonSummary&gt;**](PokemonSummary.md) | List of Pokemon that can learn the move |  [readonly] |



