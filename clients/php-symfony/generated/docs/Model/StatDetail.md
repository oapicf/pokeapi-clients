# StatDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**gameIndex** | **int** | ID the games use for this stat. | 
**isBattleOnly** | **bool** | Whether this stat only exists within a battle. | [optional] 
**affectingMoves** | [**OpenAPI\Server\Model\StatAffectingMoves**](StatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. | [readonly] 
**affectingNatures** | [**OpenAPI\Server\Model\StatAffectingNatures**](StatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. | [readonly] 
**affectingItems** | [**OpenAPI\Server\Model\ItemSummary**](ItemSummary.md) | Items that affect this stat, such as vitamins and battle items. | [readonly] 
**characteristics** | [**OpenAPI\Server\Model\CharacteristicSummary**](CharacteristicSummary.md) | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. | [readonly] 
**moveDamageClass** | [**OpenAPI\Server\Model\MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage this stat is directly related to. | 
**names** | [**OpenAPI\Server\Model\StatName**](StatName.md) | The name of this resource listed in different languages. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


