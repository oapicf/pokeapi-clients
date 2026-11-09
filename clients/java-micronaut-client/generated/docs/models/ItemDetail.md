

# ItemDetail

The class is defined in **[ItemDetail.java](../../src/main/java/org/openapitools/model/ItemDetail.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Integer` | The identifier for this resource. |  [readonly property]
**name** | `String` | The name for this resource. | 
**flingPower** | `Integer` | The power of the move Fling when used with this item. |  [optional property]
**flingEffect** | [`ItemFlingEffectSummary`](ItemFlingEffectSummary.md) | The effect of the move Fling when used with this item. | 
**attributes** | [`List&lt;ItemAttributeSummary&gt;`](ItemAttributeSummary.md) | A list of attributes this item has. |  [readonly property]
**category** | [`ItemCategorySummary`](ItemCategorySummary.md) | The category of items this item falls into. | 
**effectEntries** | [`List&lt;ItemEffectText&gt;`](ItemEffectText.md) | The effect of this ability listed in different languages. |  [readonly property]
**flavorTextEntries** | [`List&lt;ItemFlavorText&gt;`](ItemFlavorText.md) | The flavor text of this ability listed in different languages. |  [readonly property]
**gameIndices** | [`List&lt;ItemGameIndex&gt;`](ItemGameIndex.md) | A list of game indices relevent to this item by generation. |  [readonly property]
**prices** | [`List&lt;ItemPrice&gt;`](ItemPrice.md) | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. |  [readonly property]
**names** | [`List&lt;ItemName&gt;`](ItemName.md) | The name of this item listed in different languages. |  [readonly property]
**heldByPokemon** | [`List&lt;PokemonHeldItem&gt;`](PokemonHeldItem.md) | A list of Pokémon that might be found in the wild holding this item. |  [readonly property]
**sprites** | [`ItemSprites`](ItemSprites.md) | A set of sprites used to depict this item in the game. |  [readonly property]
**babyTriggerFor** | [`EvolutionChainSummary`](EvolutionChainSummary.md) | An evolution chain this item requires to produce a bay during mating. |  [readonly property]
**machines** | [`List&lt;ItemMachine&gt;`](ItemMachine.md) | A list of the machines related to this item. |  [readonly property]

















