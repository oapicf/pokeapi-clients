# MoveDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly]
**name** | **string** | The name for this resource. |
**accuracy** | **int** | The percent value of how likely this move is to be successful. | [optional]
**effect_chance** | **int** | The percent value of how likely it is this moves effect will happen. |
**pp** | **int** | Power points. The number of times this move can be used. | [optional]
**priority** | **int** | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. | [optional]
**power** | **int** | The base power of this move, or null if it has no fixed base power. | [optional]
**contest_combos** | [**\OpenAPI\Client\Model\MoveCombos**](MoveCombos.md) | A detail of normal and super contest combos that require this move. | [readonly]
**contest_type** | [**\OpenAPI\Client\Model\ContestTypeSummary**](ContestTypeSummary.md) | The type of appeal this move gives a Pokémon when used in a contest. |
**contest_effect** | [**\OpenAPI\Client\Model\ContestEffectSummary**](ContestEffectSummary.md) | The effect the move has when used in a contest. |
**damage_class** | [**\OpenAPI\Client\Model\MoveDamageClassSummary**](MoveDamageClassSummary.md) | The type of damage the move inflicts on the target, e.g. physical. |
**effect_entries** | [**\OpenAPI\Client\Model\MoveEffectEffectText[]**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly]
**effect_changes** | [**\OpenAPI\Client\Model\MoveEffectChange[]**](MoveEffectChange.md) | The list of previous effects this move has had across version groups of the games. | [readonly]
**generation** | [**\OpenAPI\Client\Model\GenerationSummary**](GenerationSummary.md) | The generation in which this move was introduced. |
**meta** | [**\OpenAPI\Client\Model\MoveMeta**](MoveMeta.md) | Metadata about this move | [readonly]
**names** | [**\OpenAPI\Client\Model\MoveName[]**](MoveName.md) | The name of this resource listed in different languages. | [readonly]
**past_values** | [**\OpenAPI\Client\Model\MoveChange[]**](MoveChange.md) | A list of move resource value changes across version groups of the game. | [readonly]
**stat_changes** | [**\OpenAPI\Client\Model\MoveMetaStatChange[]**](MoveMetaStatChange.md) | A list of stats this moves effects and how much it effects them. | [readonly]
**super_contest_effect** | [**\OpenAPI\Client\Model\SuperContestEffectSummary**](SuperContestEffectSummary.md) | The effect the move has when used in a super contest. |
**target** | [**\OpenAPI\Client\Model\MoveTargetSummary**](MoveTargetSummary.md) | The type of target that will receive the effects of the attack. |
**type** | [**\OpenAPI\Client\Model\TypeSummary**](TypeSummary.md) | The elemental type of this move. |
**machines** | [**\OpenAPI\Client\Model\ItemMachine[]**](ItemMachine.md) | A list of the machines that teach this move. | [readonly]
**flavor_text_entries** | [**\OpenAPI\Client\Model\MoveFlavorText[]**](MoveFlavorText.md) | The flavor text of this move listed in different languages. | [readonly]
**learned_by_pokemon** | [**\OpenAPI\Client\Model\PokemonSummary[]**](PokemonSummary.md) | List of Pokemon that can learn the move | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
