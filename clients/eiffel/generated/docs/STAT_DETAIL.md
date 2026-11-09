# STAT_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**game_index** | **INTEGER_32** | ID the games use for this stat. | [default to null]
**is_battle_only** | **BOOLEAN** | Whether this stat only exists within a battle. | [optional] [default to null]
**affecting_moves** | [**STAT_AFFECTING_MOVES**](StatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. | [readonly] [default to null]
**affecting_natures** | [**STAT_AFFECTING_NATURES**](StatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. | [readonly] [default to null]
**affecting_items** | [**LIST [ITEM_SUMMARY]**](ItemSummary.md) | Items that affect this stat, such as vitamins and battle items. | [readonly] [default to null]
**characteristics** | [**LIST [CHARACTERISTIC_SUMMARY]**](CharacteristicSummary.md) | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. | [readonly] [default to null]
**move_damage_class** | [**MOVE_DAMAGE_CLASS_SUMMARY**](MoveDamageClassSummary.md) | The class of damage this stat is directly related to. | [default to null]
**names** | [**LIST [STAT_NAME]**](StatName.md) | The name of this resource listed in different languages. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


