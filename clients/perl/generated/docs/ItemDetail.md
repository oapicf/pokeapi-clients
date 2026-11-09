# WWW::OpenAPIClient::Object::ItemDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::ItemDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**fling_power** | **int** | The power of the move Fling when used with this item. | [optional] 
**fling_effect** | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) | The effect of the move Fling when used with this item. | 
**attributes** | [**ARRAY[ItemAttributeSummary]**](ItemAttributeSummary.md) | A list of attributes this item has. | [readonly] 
**category** | [**ItemCategorySummary**](ItemCategorySummary.md) | The category of items this item falls into. | 
**effect_entries** | [**ARRAY[ItemEffectText]**](ItemEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**flavor_text_entries** | [**ARRAY[ItemFlavorText]**](ItemFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**game_indices** | [**ARRAY[ItemGameIndex]**](ItemGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**prices** | [**ARRAY[ItemPrice]**](ItemPrice.md) | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. | [readonly] 
**names** | [**ARRAY[ItemName]**](ItemName.md) | The name of this item listed in different languages. | [readonly] 
**held_by_pokemon** | [**ARRAY[PokemonHeldItem]**](PokemonHeldItem.md) | A list of Pokémon that might be found in the wild holding this item. | [readonly] 
**sprites** | [**ItemSprites**](ItemSprites.md) | A set of sprites used to depict this item in the game. | [readonly] 
**baby_trigger_for** | [**EvolutionChainSummary**](EvolutionChainSummary.md) | An evolution chain this item requires to produce a bay during mating. | [readonly] 
**machines** | [**ARRAY[ItemMachine]**](ItemMachine.md) | A list of the machines related to this item. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


