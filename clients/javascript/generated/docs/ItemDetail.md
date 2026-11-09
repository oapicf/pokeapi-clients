# PokeapiClient.ItemDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**flingPower** | **Number** | The power of the move Fling when used with this item. | [optional] 
**flingEffect** | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) | The effect of the move Fling when used with this item. | 
**attributes** | [**[ItemAttributeSummary]**](ItemAttributeSummary.md) | A list of attributes this item has. | [readonly] 
**category** | [**ItemCategorySummary**](ItemCategorySummary.md) | The category of items this item falls into. | 
**effectEntries** | [**[ItemEffectText]**](ItemEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**flavorTextEntries** | [**[ItemFlavorText]**](ItemFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**gameIndices** | [**[ItemGameIndex]**](ItemGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**prices** | [**[ItemPrice]**](ItemPrice.md) | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. | [readonly] 
**names** | [**[ItemName]**](ItemName.md) | The name of this item listed in different languages. | [readonly] 
**heldByPokemon** | [**[PokemonHeldItem]**](PokemonHeldItem.md) | A list of Pokémon that might be found in the wild holding this item. | [readonly] 
**sprites** | [**ItemSprites**](ItemSprites.md) | A set of sprites used to depict this item in the game. | [readonly] 
**babyTriggerFor** | [**EvolutionChainSummary**](EvolutionChainSummary.md) | An evolution chain this item requires to produce a bay during mating. | [readonly] 
**machines** | [**[ItemMachine]**](ItemMachine.md) | A list of the machines related to this item. | [readonly] 


