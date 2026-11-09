# item_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **char \*** | The name for this resource. | 
**fling_power** | **int** | The power of the move Fling when used with this item. | [optional] 
**fling_effect** | [**item_fling_effect_summary_t**](item_fling_effect_summary.md) \* | The effect of the move Fling when used with this item. | 
**attributes** | [**list_t**](item_attribute_summary.md) \* | A list of attributes this item has. | [readonly] 
**category** | [**item_category_summary_t**](item_category_summary.md) \* | The category of items this item falls into. | 
**effect_entries** | [**list_t**](item_effect_text.md) \* | The effect of this ability listed in different languages. | [readonly] 
**flavor_text_entries** | [**list_t**](item_flavor_text.md) \* | The flavor text of this ability listed in different languages. | [readonly] 
**game_indices** | [**list_t**](item_game_index.md) \* | A list of game indices relevent to this item by generation. | [readonly] 
**prices** | [**list_t**](item_price.md) \* | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. | [readonly] 
**names** | [**list_t**](item_name.md) \* | The name of this item listed in different languages. | [readonly] 
**held_by_pokemon** | [**list_t**](pokemon_held_item.md) \* | A list of Pokémon that might be found in the wild holding this item. | [readonly] 
**sprites** | [**item_sprites_t**](item_sprites.md) \* | A set of sprites used to depict this item in the game. | [readonly] 
**baby_trigger_for** | [**evolution_chain_summary_t**](evolution_chain_summary.md) \* | An evolution chain this item requires to produce a bay during mating. | [readonly] 
**machines** | [**list_t**](item_machine.md) \* | A list of the machines related to this item. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


