# openapi::ItemDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**fling_power** | **integer** | The power of the move Fling when used with this item. | [optional] [Max: 2147483647] [Min: -2147483648] 
**fling_effect** | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) | The effect of the move Fling when used with this item. | 
**attributes** | [**array[ItemAttributeSummary]**](ItemAttributeSummary.md) | A list of attributes this item has. | [readonly] 
**category** | [**ItemCategorySummary**](ItemCategorySummary.md) | The category of items this item falls into. | 
**effect_entries** | [**array[ItemEffectText]**](ItemEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**flavor_text_entries** | [**array[ItemFlavorText]**](ItemFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**game_indices** | [**array[ItemGameIndex]**](ItemGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**prices** | [**array[ItemPrice]**](ItemPrice.md) | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. | [readonly] 
**names** | [**array[ItemName]**](ItemName.md) | The name of this item listed in different languages. | [readonly] 
**held_by_pokemon** | [**array[PokemonHeldItem]**](PokemonHeldItem.md) | A list of Pokémon that might be found in the wild holding this item. | [readonly] 
**sprites** | [**ItemSprites**](ItemSprites.md) | A set of sprites used to depict this item in the game. | [readonly] 
**baby_trigger_for** | [**EvolutionChainSummary**](EvolutionChainSummary.md) | An evolution chain this item requires to produce a bay during mating. | [readonly] 
**machines** | [**array[ItemMachine]**](ItemMachine.md) | A list of the machines related to this item. | [readonly] 


