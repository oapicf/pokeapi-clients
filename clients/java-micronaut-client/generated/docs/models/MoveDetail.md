

# MoveDetail

The class is defined in **[MoveDetail.java](../../src/main/java/org/openapitools/model/MoveDetail.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Integer` | The identifier for this resource. |  [readonly property]
**name** | `String` | The name for this resource. | 
**accuracy** | `Integer` | The percent value of how likely this move is to be successful. |  [optional property]
**effectChance** | `Integer` | The percent value of how likely it is this moves effect will happen. | 
**pp** | `Integer` | Power points. The number of times this move can be used. |  [optional property]
**priority** | `Integer` | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. |  [optional property]
**power** | `Integer` | The base power of this move, or null if it has no fixed base power. |  [optional property]
**contestCombos** | [`MoveCombos`](MoveCombos.md) | A detail of normal and super contest combos that require this move. |  [readonly property]
**contestType** | [`ContestTypeSummary`](ContestTypeSummary.md) | The type of appeal this move gives a Pokémon when used in a contest. | 
**contestEffect** | [`ContestEffectSummary`](ContestEffectSummary.md) | The effect the move has when used in a contest. | 
**damageClass** | [`MoveDamageClassSummary`](MoveDamageClassSummary.md) | The type of damage the move inflicts on the target, e.g. physical. | 
**effectEntries** | [`List&lt;MoveEffectEffectText&gt;`](MoveEffectEffectText.md) | The effect of this move listed in different languages. |  [readonly property]
**effectChanges** | [`List&lt;MoveEffectChange&gt;`](MoveEffectChange.md) | The list of previous effects this move has had across version groups of the games. |  [readonly property]
**generation** | [`GenerationSummary`](GenerationSummary.md) | The generation in which this move was introduced. | 
**meta** | [`MoveMeta`](MoveMeta.md) | Metadata about this move |  [readonly property]
**names** | [`List&lt;MoveName&gt;`](MoveName.md) | The name of this resource listed in different languages. |  [readonly property]
**pastValues** | [`List&lt;MoveChange&gt;`](MoveChange.md) | A list of move resource value changes across version groups of the game. |  [readonly property]
**statChanges** | [`List&lt;MoveMetaStatChange&gt;`](MoveMetaStatChange.md) | A list of stats this moves effects and how much it effects them. |  [readonly property]
**superContestEffect** | [`SuperContestEffectSummary`](SuperContestEffectSummary.md) | The effect the move has when used in a super contest. | 
**target** | [`MoveTargetSummary`](MoveTargetSummary.md) | The type of target that will receive the effects of the attack. | 
**type** | [`TypeSummary`](TypeSummary.md) | The elemental type of this move. | 
**machines** | [`List&lt;ItemMachine&gt;`](ItemMachine.md) | A list of the machines that teach this move. |  [readonly property]
**flavorTextEntries** | [`List&lt;MoveFlavorText&gt;`](MoveFlavorText.md) | The flavor text of this move listed in different languages. |  [readonly property]
**learnedByPokemon** | [`List&lt;PokemonSummary&gt;`](PokemonSummary.md) | List of Pokemon that can learn the move |  [readonly property]


























