# StatDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | The identifier for this resource. | [readonly] [default to null]
**name** | **String!** | The name for this resource. | [default to null]
**gameIndex** | **Int!** | ID the games use for this stat. | [default to null]
**isBattleOnly** | **Boolean!** | Whether this stat only exists within a battle. | [optional] [default to null]
**affectingMoves** | [***StatAffectingMoves**](StatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. | [readonly] [default to null]
**affectingNatures** | [***StatAffectingNatures**](StatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. | [readonly] [default to null]
**affectingItems** | [**ItemSummary**](ItemSummary.md) | Items that affect this stat, such as vitamins and battle items. | [readonly] [default to null]
**characteristics** | [**CharacteristicSummary**](CharacteristicSummary.md) | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. | [readonly] [default to null]
**moveDamageClass** | [***MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage this stat is directly related to. | [default to null]
**names** | [**StatName**](StatName.md) | The name of this resource listed in different languages. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


