# pokemon_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **char \*** |  | 
**base_experience** | **int** |  | [optional] 
**height** | **int** |  | [optional] 
**is_default** | **int** |  | [optional] 
**order** | **int** |  | [optional] 
**weight** | **int** |  | [optional] 
**abilities** | [**list_t**](pokemon_detail_abilities_inner.md) \* |  | 
**past_abilities** | [**list_t**](pokemon_detail_past_abilities_inner.md) \* |  | 
**forms** | [**list_t**](pokemon_form_summary.md) \* |  | 
**game_indices** | [**list_t**](pokemon_game_index.md) \* |  | 
**held_items** | [**pokemon_detail_held_items_t**](pokemon_detail_held_items.md) \* |  | 
**location_area_encounters** | **char \*** |  | [readonly] 
**moves** | [**list_t**](pokemon_detail_moves_inner.md) \* |  | 
**species** | [**pokemon_species_summary_t**](pokemon_species_summary.md) \* |  | 
**sprites** | **pokemon_detail_sprites_t \*** |  | 
**cries** | [**pokemon_detail_cries_t**](pokemon_detail_cries.md) \* |  | 
**stats** | [**list_t**](pokemon_stat.md) \* |  | 
**types** | [**list_t**](pokemon_detail_types_inner.md) \* |  | 
**past_types** | [**list_t**](pokemon_detail_past_types_inner.md) \* |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


