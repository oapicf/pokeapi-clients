# MoveDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`accuracy`** | **`Int64`** | The percent value of how likely this move is to be successful. | [optional] [default to nothing]
**`effect_chance`** | **`Int64`** | The percent value of how likely it is this moves effect will happen. | [default to nothing]
**`pp`** | **`Int64`** | Power points. The number of times this move can be used. | [optional] [default to nothing]
**`priority`** | **`Int64`** | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. | [optional] [default to nothing]
**`power`** | **`Int64`** | The base power of this move, or null if it has no fixed base power. | [optional] [default to nothing]
**`contest_combos`** | [**`*MoveCombos`**](MoveCombos.md) | A detail of normal and super contest combos that require this move. | [readonly] [default to nothing]
**`contest_type`** | [**`*ContestTypeSummary`**](ContestTypeSummary.md) | The type of appeal this move gives a Pokémon when used in a contest. | [default to nothing]
**`contest_effect`** | [**`*ContestEffectSummary`**](ContestEffectSummary.md) | The effect the move has when used in a contest. | [default to nothing]
**`damage_class`** | [**`*MoveDamageClassSummary`**](MoveDamageClassSummary.md) | The type of damage the move inflicts on the target, e.g. physical. | [default to nothing]
**`effect_entries`** | [**`Vector{MoveEffectEffectText}`**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] [default to nothing]
**`effect_changes`** | [**`Vector{MoveEffectChange}`**](MoveEffectChange.md) | The list of previous effects this move has had across version groups of the games. | [readonly] [default to nothing]
**`generation`** | [**`*GenerationSummary`**](GenerationSummary.md) | The generation in which this move was introduced. | [default to nothing]
**`meta`** | [**`*MoveMeta`**](MoveMeta.md) | Metadata about this move | [readonly] [default to nothing]
**`names`** | [**`Vector{MoveName}`**](MoveName.md) | The name of this resource listed in different languages. | [readonly] [default to nothing]
**`past_values`** | [**`Vector{MoveChange}`**](MoveChange.md) | A list of move resource value changes across version groups of the game. | [readonly] [default to nothing]
**`stat_changes`** | [**`Vector{MoveMetaStatChange}`**](MoveMetaStatChange.md) | A list of stats this moves effects and how much it effects them. | [readonly] [default to nothing]
**`super_contest_effect`** | [**`*SuperContestEffectSummary`**](SuperContestEffectSummary.md) | The effect the move has when used in a super contest. | [default to nothing]
**`target`** | [**`*MoveTargetSummary`**](MoveTargetSummary.md) | The type of target that will receive the effects of the attack. | [default to nothing]
**`type`** | [**`*TypeSummary`**](TypeSummary.md) | The elemental type of this move. | [default to nothing]
**`machines`** | [**`Vector{ItemMachine}`**](ItemMachine.md) | A list of the machines that teach this move. | [readonly] [default to nothing]
**`flavor_text_entries`** | [**`Vector{MoveFlavorText}`**](MoveFlavorText.md) | The flavor text of this move listed in different languages. | [readonly] [default to nothing]
**`learned_by_pokemon`** | [**`Vector{PokemonSummary}`**](PokemonSummary.md) | List of Pokemon that can learn the move | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


