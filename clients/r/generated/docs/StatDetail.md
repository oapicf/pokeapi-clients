# openapi::StatDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** |  | [readonly] 
**name** | **character** |  | [Max. length: 100] 
**game_index** | **integer** |  | 
**is_battle_only** | **character** |  | [optional] 
**affecting_moves** | [**StatDetailAffectingMoves**](StatDetail_affecting_moves.md) |  | 
**affecting_natures** | [**StatDetailAffectingNatures**](StatDetail_affecting_natures.md) |  | 
**characteristics** | [**array[CharacteristicSummary]**](CharacteristicSummary.md) |  | 
**move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**names** | [**array[StatName]**](StatName.md) |  | 


