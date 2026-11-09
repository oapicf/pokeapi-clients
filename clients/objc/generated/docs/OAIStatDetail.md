# OAIStatDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | The identifier for this resource. | [readonly] 
**name** | **NSString*** | The name for this resource. | 
**gameIndex** | **NSNumber*** | ID the games use for this stat. | 
**isBattleOnly** | **NSNumber*** | Whether this stat only exists within a battle. | [optional] 
**affectingMoves** | [**OAIStatAffectingMoves***](OAIStatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. | [readonly] 
**affectingNatures** | [**OAIStatAffectingNatures***](OAIStatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. | [readonly] 
**affectingItems** | [**NSArray&lt;OAIItemSummary&gt;***](OAIItemSummary.md) | Items that affect this stat, such as vitamins and battle items. | [readonly] 
**characteristics** | [**NSArray&lt;OAICharacteristicSummary&gt;***](OAICharacteristicSummary.md) | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. | [readonly] 
**moveDamageClass** | [**OAIMoveDamageClassSummary***](OAIMoveDamageClassSummary.md) | The class of damage this stat is directly related to. | 
**names** | [**NSArray&lt;OAIStatName&gt;***](OAIStatName.md) | The name of this resource listed in different languages. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


