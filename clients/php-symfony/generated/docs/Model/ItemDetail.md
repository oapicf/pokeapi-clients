# ItemDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**flingPower** | **int** | The power of the move Fling when used with this item. | [optional] 
**flingEffect** | [**OpenAPI\Server\Model\ItemFlingEffectSummary**](ItemFlingEffectSummary.md) | The effect of the move Fling when used with this item. | 
**attributes** | [**OpenAPI\Server\Model\ItemAttributeSummary**](ItemAttributeSummary.md) | A list of attributes this item has. | [readonly] 
**category** | [**OpenAPI\Server\Model\ItemCategorySummary**](ItemCategorySummary.md) | The category of items this item falls into. | 
**effectEntries** | [**OpenAPI\Server\Model\ItemEffectText**](ItemEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**flavorTextEntries** | [**OpenAPI\Server\Model\ItemFlavorText**](ItemFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**gameIndices** | [**OpenAPI\Server\Model\ItemGameIndex**](ItemGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**prices** | [**OpenAPI\Server\Model\ItemPrice**](ItemPrice.md) | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. | [readonly] 
**names** | [**OpenAPI\Server\Model\ItemName**](ItemName.md) | The name of this item listed in different languages. | [readonly] 
**heldByPokemon** | [**OpenAPI\Server\Model\PokemonHeldItem**](PokemonHeldItem.md) | A list of Pokémon that might be found in the wild holding this item. | [readonly] 
**sprites** | [**OpenAPI\Server\Model\ItemSprites**](ItemSprites.md) | A set of sprites used to depict this item in the game. | [readonly] 
**babyTriggerFor** | [**OpenAPI\Server\Model\EvolutionChainSummary**](EvolutionChainSummary.md) | An evolution chain this item requires to produce a bay during mating. | [readonly] 
**machines** | [**OpenAPI\Server\Model\ItemMachine**](ItemMachine.md) | A list of the machines related to this item. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


