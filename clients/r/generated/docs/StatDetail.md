# openapi::StatDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**game_index** | **integer** | ID the games use for this stat. | [Max: 2147483647] [Min: -2147483648] 
**is_battle_only** | **character** | Whether this stat only exists within a battle. | [optional] 
**affecting_moves** | [**StatAffectingMoves**](StatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. | [readonly] 
**affecting_natures** | [**StatAffectingNatures**](StatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. | [readonly] 
**affecting_items** | [**array[ItemSummary]**](ItemSummary.md) | Items that affect this stat, such as vitamins and battle items. | [readonly] 
**characteristics** | [**array[CharacteristicSummary]**](CharacteristicSummary.md) | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. | [readonly] 
**move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage this stat is directly related to. | 
**names** | [**array[StatName]**](StatName.md) | The name of this resource listed in different languages. | [readonly] 


