# OAIItemDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | The identifier for this resource. | [readonly] 
**name** | **NSString*** | The name for this resource. | 
**flingPower** | **NSNumber*** | The power of the move Fling when used with this item. | [optional] 
**flingEffect** | [**OAIItemFlingEffectSummary***](OAIItemFlingEffectSummary.md) | The effect of the move Fling when used with this item. | 
**attributes** | [**NSArray&lt;OAIItemAttributeSummary&gt;***](OAIItemAttributeSummary.md) | A list of attributes this item has. | [readonly] 
**category** | [**OAIItemCategorySummary***](OAIItemCategorySummary.md) | The category of items this item falls into. | 
**effectEntries** | [**NSArray&lt;OAIItemEffectText&gt;***](OAIItemEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**flavorTextEntries** | [**NSArray&lt;OAIItemFlavorText&gt;***](OAIItemFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**gameIndices** | [**NSArray&lt;OAIItemGameIndex&gt;***](OAIItemGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**prices** | [**NSArray&lt;OAIItemPrice&gt;***](OAIItemPrice.md) | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. | [readonly] 
**names** | [**NSArray&lt;OAIItemName&gt;***](OAIItemName.md) | The name of this item listed in different languages. | [readonly] 
**heldByPokemon** | [**NSArray&lt;OAIPokemonHeldItem&gt;***](OAIPokemonHeldItem.md) | A list of Pokémon that might be found in the wild holding this item. | [readonly] 
**sprites** | [**OAIItemSprites***](OAIItemSprites.md) | A set of sprites used to depict this item in the game. | [readonly] 
**babyTriggerFor** | [**OAIEvolutionChainSummary***](OAIEvolutionChainSummary.md) | An evolution chain this item requires to produce a bay during mating. | [readonly] 
**machines** | [**NSArray&lt;OAIItemMachine&gt;***](OAIItemMachine.md) | A list of the machines related to this item. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


