# Org.OpenAPITools.Model.ItemDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**Attributes** | [**List&lt;ItemAttributeSummary&gt;**](ItemAttributeSummary.md) | A list of attributes this item has. | [readonly] 
**Category** | [**ItemCategorySummary**](ItemCategorySummary.md) | The category of items this item falls into. | 
**EffectEntries** | [**List&lt;ItemEffectText&gt;**](ItemEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**FlavorTextEntries** | [**List&lt;ItemFlavorText&gt;**](ItemFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**GameIndices** | [**List&lt;ItemGameIndex&gt;**](ItemGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**Prices** | [**List&lt;ItemPrice&gt;**](ItemPrice.md) | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. | [readonly] 
**Names** | [**List&lt;ItemName&gt;**](ItemName.md) | The name of this item listed in different languages. | [readonly] 
**HeldByPokemon** | [**List&lt;PokemonHeldItem&gt;**](PokemonHeldItem.md) | A list of Pokémon that might be found in the wild holding this item. | [readonly] 
**Sprites** | [**ItemSprites**](ItemSprites.md) | A set of sprites used to depict this item in the game. | [readonly] 
**Machines** | [**List&lt;ItemMachine&gt;**](ItemMachine.md) | A list of the machines related to this item. | [readonly] 
**FlingPower** | **int** | The power of the move Fling when used with this item. | [optional] 
**FlingEffect** | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) | The effect of the move Fling when used with this item. | 
**BabyTriggerFor** | [**EvolutionChainSummary**](EvolutionChainSummary.md) | An evolution chain this item requires to produce a bay during mating. | [readonly] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

