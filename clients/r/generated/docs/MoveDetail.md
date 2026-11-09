# openapi::MoveDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**accuracy** | **integer** | The percent value of how likely this move is to be successful. | [optional] [Max: 2147483647] [Min: -2147483648] 
**effect_chance** | **integer** | The percent value of how likely it is this moves effect will happen. | 
**pp** | **integer** | Power points. The number of times this move can be used. | [optional] [Max: 2147483647] [Min: -2147483648] 
**priority** | **integer** | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. | [optional] [Max: 2147483647] [Min: -2147483648] 
**power** | **integer** | The base power of this move, or null if it has no fixed base power. | [optional] [Max: 2147483647] [Min: -2147483648] 
**contest_combos** | [**MoveCombos**](MoveCombos.md) | A detail of normal and super contest combos that require this move. | [readonly] 
**contest_type** | [**ContestTypeSummary**](ContestTypeSummary.md) | The type of appeal this move gives a Pokémon when used in a contest. | 
**contest_effect** | [**ContestEffectSummary**](ContestEffectSummary.md) | The effect the move has when used in a contest. | 
**damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The type of damage the move inflicts on the target, e.g. physical. | 
**effect_entries** | [**array[MoveEffectEffectText]**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] 
**effect_changes** | [**array[MoveEffectChange]**](MoveEffectChange.md) | The list of previous effects this move has had across version groups of the games. | [readonly] 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation in which this move was introduced. | 
**meta** | [**MoveMeta**](MoveMeta.md) | Metadata about this move | [readonly] 
**names** | [**array[MoveName]**](MoveName.md) | The name of this resource listed in different languages. | [readonly] 
**past_values** | [**array[MoveChange]**](MoveChange.md) | A list of move resource value changes across version groups of the game. | [readonly] 
**stat_changes** | [**array[MoveMetaStatChange]**](MoveMetaStatChange.md) | A list of stats this moves effects and how much it effects them. | [readonly] 
**super_contest_effect** | [**SuperContestEffectSummary**](SuperContestEffectSummary.md) | The effect the move has when used in a super contest. | 
**target** | [**MoveTargetSummary**](MoveTargetSummary.md) | The type of target that will receive the effects of the attack. | 
**type** | [**TypeSummary**](TypeSummary.md) | The elemental type of this move. | 
**machines** | [**array[ItemMachine]**](ItemMachine.md) | A list of the machines that teach this move. | [readonly] 
**flavor_text_entries** | [**array[MoveFlavorText]**](MoveFlavorText.md) | The flavor text of this move listed in different languages. | [readonly] 
**learned_by_pokemon** | [**array[PokemonSummary]**](PokemonSummary.md) | List of Pokemon that can learn the move | [readonly] 


