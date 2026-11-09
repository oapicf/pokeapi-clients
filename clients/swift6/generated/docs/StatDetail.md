# StatDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**gameIndex** | **Int** | ID the games use for this stat. | 
**isBattleOnly** | **Bool** | Whether this stat only exists within a battle. | [optional] 
**affectingMoves** | [**StatAffectingMoves**](StatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. | [readonly] 
**affectingNatures** | [**StatAffectingNatures**](StatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. | [readonly] 
**affectingItems** | [ItemSummary] | Items that affect this stat, such as vitamins and battle items. | [readonly] 
**characteristics** | [CharacteristicSummary] | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. | [readonly] 
**moveDamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage this stat is directly related to. | 
**names** | [StatName] | The name of this resource listed in different languages. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


