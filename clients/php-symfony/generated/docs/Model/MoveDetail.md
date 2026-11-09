# MoveDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**accuracy** | **int** | The percent value of how likely this move is to be successful. | [optional] 
**effectChance** | **int** | The percent value of how likely it is this moves effect will happen. | 
**pp** | **int** | Power points. The number of times this move can be used. | [optional] 
**priority** | **int** | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. | [optional] 
**power** | **int** | The base power of this move, or null if it has no fixed base power. | [optional] 
**contestCombos** | [**OpenAPI\Server\Model\MoveCombos**](MoveCombos.md) | A detail of normal and super contest combos that require this move. | [readonly] 
**contestType** | [**OpenAPI\Server\Model\ContestTypeSummary**](ContestTypeSummary.md) | The type of appeal this move gives a Pokémon when used in a contest. | 
**contestEffect** | [**OpenAPI\Server\Model\ContestEffectSummary**](ContestEffectSummary.md) | The effect the move has when used in a contest. | 
**damageClass** | [**OpenAPI\Server\Model\MoveDamageClassSummary**](MoveDamageClassSummary.md) | The type of damage the move inflicts on the target, e.g. physical. | 
**effectEntries** | [**OpenAPI\Server\Model\MoveEffectEffectText**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] 
**effectChanges** | [**OpenAPI\Server\Model\MoveEffectChange**](MoveEffectChange.md) | The list of previous effects this move has had across version groups of the games. | [readonly] 
**generation** | [**OpenAPI\Server\Model\GenerationSummary**](GenerationSummary.md) | The generation in which this move was introduced. | 
**meta** | [**OpenAPI\Server\Model\MoveMeta**](MoveMeta.md) | Metadata about this move | [readonly] 
**names** | [**OpenAPI\Server\Model\MoveName**](MoveName.md) | The name of this resource listed in different languages. | [readonly] 
**pastValues** | [**OpenAPI\Server\Model\MoveChange**](MoveChange.md) | A list of move resource value changes across version groups of the game. | [readonly] 
**statChanges** | [**OpenAPI\Server\Model\MoveMetaStatChange**](MoveMetaStatChange.md) | A list of stats this moves effects and how much it effects them. | [readonly] 
**superContestEffect** | [**OpenAPI\Server\Model\SuperContestEffectSummary**](SuperContestEffectSummary.md) | The effect the move has when used in a super contest. | 
**target** | [**OpenAPI\Server\Model\MoveTargetSummary**](MoveTargetSummary.md) | The type of target that will receive the effects of the attack. | 
**type** | [**OpenAPI\Server\Model\TypeSummary**](TypeSummary.md) | The elemental type of this move. | 
**machines** | [**OpenAPI\Server\Model\ItemMachine**](ItemMachine.md) | A list of the machines that teach this move. | [readonly] 
**flavorTextEntries** | [**OpenAPI\Server\Model\MoveFlavorText**](MoveFlavorText.md) | The flavor text of this move listed in different languages. | [readonly] 
**learnedByPokemon** | [**OpenAPI\Server\Model\PokemonSummary**](PokemonSummary.md) | List of Pokemon that can learn the move | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


