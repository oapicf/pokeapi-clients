# ItemDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**fling_power** | **i32** | The power of the move Fling when used with this item. | [optional] [default to None]
**fling_effect** | [***models::ItemFlingEffectSummary**](ItemFlingEffectSummary.md) | The effect of the move Fling when used with this item. | 
**attributes** | [**Vec<models::ItemAttributeSummary>**](ItemAttributeSummary.md) | A list of attributes this item has. | [readonly] 
**category** | [***models::ItemCategorySummary**](ItemCategorySummary.md) | The category of items this item falls into. | 
**effect_entries** | [**Vec<models::ItemEffectText>**](ItemEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**flavor_text_entries** | [**Vec<models::ItemFlavorText>**](ItemFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**game_indices** | [**Vec<models::ItemGameIndex>**](ItemGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**prices** | [**Vec<models::ItemPrice>**](ItemPrice.md) | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. | [readonly] 
**names** | [**Vec<models::ItemName>**](ItemName.md) | The name of this item listed in different languages. | [readonly] 
**held_by_pokemon** | [**Vec<models::PokemonHeldItem>**](PokemonHeldItem.md) | A list of Pokémon that might be found in the wild holding this item. | [readonly] 
**sprites** | [***models::ItemSprites**](ItemSprites.md) | A set of sprites used to depict this item in the game. | [readonly] 
**baby_trigger_for** | [***models::EvolutionChainSummary**](EvolutionChainSummary.md) | An evolution chain this item requires to produce a bay during mating. | [readonly] 
**machines** | [**Vec<models::ItemMachine>**](ItemMachine.md) | A list of the machines related to this item. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


