# type_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **char \*** | The name for this resource. | 
**damage_relations** | [**type_relationships_t**](type_relationships.md) \* | A detail of how effective this type is toward others and vice versa. | [readonly] 
**past_damage_relations** | [**list_t**](type_past_relationships.md) \* | A list of details of how effective this type was toward others and vice versa in previous generations | [readonly] 
**game_indices** | [**list_t**](type_game_index.md) \* | A list of game indices relevent to this item by generation. | [readonly] 
**generation** | [**generation_summary_t**](generation_summary.md) \* | The generation this type was introduced in. | 
**move_damage_class** | [**move_damage_class_summary_t**](move_damage_class_summary.md) \* | The class of damage inflicted by this type. | 
**names** | [**list_t**](ModelTypeName.md) \* | The name of this resource listed in different languages. | [readonly] 
**pokemon** | [**list_t**](type_pokemon.md) \* | A list of details of Pokémon that have this type. | [readonly] 
**moves** | [**list_t**](move_summary.md) \* | A list of moves that have this type. | [readonly] 
**sprites** | **list_t*** | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


