# MoveDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly]
**name** | **String** | The name for this resource. | 
**accuracy** | Option<**i32**> | The percent value of how likely this move is to be successful. | [optional]
**effect_chance** | Option<**i32**> | The percent value of how likely it is this moves effect will happen. | 
**pp** | Option<**i32**> | Power points. The number of times this move can be used. | [optional]
**priority** | Option<**i32**> | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. | [optional]
**power** | Option<**i32**> | The base power of this move, or null if it has no fixed base power. | [optional]
**contest_combos** | Option<[**models::MoveCombos**](MoveCombos.md)> | A detail of normal and super contest combos that require this move. | [readonly]
**contest_type** | Option<[**models::ContestTypeSummary**](ContestTypeSummary.md)> | The type of appeal this move gives a Pokémon when used in a contest. | 
**contest_effect** | Option<[**models::ContestEffectSummary**](ContestEffectSummary.md)> | The effect the move has when used in a contest. | 
**damage_class** | [**models::MoveDamageClassSummary**](MoveDamageClassSummary.md) | The type of damage the move inflicts on the target, e.g. physical. | 
**effect_entries** | [**Vec<models::MoveEffectEffectText>**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly]
**effect_changes** | [**Vec<models::MoveEffectChange>**](MoveEffectChange.md) | The list of previous effects this move has had across version groups of the games. | [readonly]
**generation** | [**models::GenerationSummary**](GenerationSummary.md) | The generation in which this move was introduced. | 
**meta** | Option<[**models::MoveMeta**](MoveMeta.md)> | Metadata about this move | [readonly]
**names** | [**Vec<models::MoveName>**](MoveName.md) | The name of this resource listed in different languages. | [readonly]
**past_values** | [**Vec<models::MoveChange>**](MoveChange.md) | A list of move resource value changes across version groups of the game. | [readonly]
**stat_changes** | [**Vec<models::MoveMetaStatChange>**](MoveMetaStatChange.md) | A list of stats this moves effects and how much it effects them. | [readonly]
**super_contest_effect** | Option<[**models::SuperContestEffectSummary**](SuperContestEffectSummary.md)> | The effect the move has when used in a super contest. | 
**target** | [**models::MoveTargetSummary**](MoveTargetSummary.md) | The type of target that will receive the effects of the attack. | 
**r#type** | [**models::TypeSummary**](TypeSummary.md) | The elemental type of this move. | 
**machines** | [**Vec<models::ItemMachine>**](ItemMachine.md) | A list of the machines that teach this move. | [readonly]
**flavor_text_entries** | [**Vec<models::MoveFlavorText>**](MoveFlavorText.md) | The flavor text of this move listed in different languages. | [readonly]
**learned_by_pokemon** | [**Vec<models::PokemonSummary>**](PokemonSummary.md) | List of Pokemon that can learn the move | [readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


