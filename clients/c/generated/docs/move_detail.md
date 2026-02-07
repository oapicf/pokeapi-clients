# move_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **char \*** |  | 
**accuracy** | **int** |  | [optional] 
**effect_chance** | **int** |  | 
**pp** | **int** |  | [optional] 
**priority** | **int** |  | [optional] 
**power** | **int** |  | [optional] 
**contest_combos** | [**move_detail_contest_combos_t**](move_detail_contest_combos.md) \* |  | 
**contest_type** | [**contest_type_summary_t**](contest_type_summary.md) \* |  | 
**contest_effect** | [**contest_effect_summary_t**](contest_effect_summary.md) \* |  | 
**damage_class** | [**move_damage_class_summary_t**](move_damage_class_summary.md) \* |  | 
**effect_entries** | [**list_t**](move_change_effect_entries_inner.md) \* |  | 
**effect_changes** | [**list_t**](move_detail_effect_changes_inner.md) \* |  | 
**generation** | [**generation_summary_t**](generation_summary.md) \* |  | 
**meta** | [**move_meta_t**](move_meta.md) \* |  | [readonly] 
**names** | [**list_t**](move_name.md) \* |  | 
**past_values** | [**list_t**](move_change.md) \* |  | 
**stat_changes** | [**list_t**](move_detail_stat_changes_inner.md) \* |  | 
**super_contest_effect** | [**super_contest_effect_summary_t**](super_contest_effect_summary.md) \* |  | 
**target** | [**move_target_summary_t**](move_target_summary.md) \* |  | 
**type** | [**type_summary_t**](type_summary.md) \* |  | 
**machines** | [**list_t**](move_detail_machines_inner.md) \* |  | 
**flavor_text_entries** | [**list_t**](move_flavor_text.md) \* |  | 
**learned_by_pokemon** | [**list_t**](ability_detail_pokemon_inner_pokemon.md) \* |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


