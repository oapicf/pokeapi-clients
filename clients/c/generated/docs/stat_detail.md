# stat_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **char \*** | The name for this resource. | 
**game_index** | **int** | ID the games use for this stat. | 
**is_battle_only** | **int** | Whether this stat only exists within a battle. | [optional] 
**affecting_moves** | [**stat_affecting_moves_t**](stat_affecting_moves.md) \* | A detail of moves which affect this stat positively or negatively. | [readonly] 
**affecting_natures** | [**stat_affecting_natures_t**](stat_affecting_natures.md) \* | A detail of natures which affect this stat positively or negatively. | [readonly] 
**affecting_items** | [**list_t**](item_summary.md) \* | Items that affect this stat, such as vitamins and battle items. | [readonly] 
**characteristics** | [**list_t**](characteristic_summary.md) \* | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. | [readonly] 
**move_damage_class** | [**move_damage_class_summary_t**](move_damage_class_summary.md) \* | The class of damage this stat is directly related to. | 
**names** | [**list_t**](stat_name.md) \* | The name of this resource listed in different languages. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


