# PokeapiClient.StatDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**gameIndex** | **Number** | ID the games use for this stat. | 
**isBattleOnly** | **Boolean** | Whether this stat only exists within a battle. | [optional] 
**affectingMoves** | [**StatAffectingMoves**](StatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. | [readonly] 
**affectingNatures** | [**StatAffectingNatures**](StatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. | [readonly] 
**affectingItems** | [**[ItemSummary]**](ItemSummary.md) | Items that affect this stat, such as vitamins and battle items. | [readonly] 
**characteristics** | [**[CharacteristicSummary]**](CharacteristicSummary.md) | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. | [readonly] 
**moveDamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage this stat is directly related to. | 
**names** | [**[StatName]**](StatName.md) | The name of this resource listed in different languages. | [readonly] 


