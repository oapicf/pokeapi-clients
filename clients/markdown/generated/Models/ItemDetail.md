# ItemDetail
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Integer** | The identifier for this resource. | [default to null] |
| **name** | **String** | The name for this resource. | [default to null] |
| **fling\_power** | **Integer** | The power of the move Fling when used with this item. | [optional] [default to null] |
| **fling\_effect** | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) | The effect of the move Fling when used with this item. | [default to null] |
| **attributes** | [**List**](ItemAttributeSummary.md) | A list of attributes this item has. | [default to null] |
| **category** | [**ItemCategorySummary**](ItemCategorySummary.md) | The category of items this item falls into. | [default to null] |
| **effect\_entries** | [**List**](ItemEffectText.md) | The effect of this ability listed in different languages. | [default to null] |
| **flavor\_text\_entries** | [**List**](ItemFlavorText.md) | The flavor text of this ability listed in different languages. | [default to null] |
| **game\_indices** | [**List**](ItemGameIndex.md) | A list of game indices relevent to this item by generation. | [default to null] |
| **prices** | [**List**](ItemPrice.md) | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. | [default to null] |
| **names** | [**List**](ItemName.md) | The name of this item listed in different languages. | [default to null] |
| **held\_by\_pokemon** | [**List**](PokemonHeldItem.md) | A list of Pokémon that might be found in the wild holding this item. | [default to null] |
| **sprites** | [**ItemSprites**](ItemSprites.md) | A set of sprites used to depict this item in the game. | [default to null] |
| **baby\_trigger\_for** | [**EvolutionChainSummary**](EvolutionChainSummary.md) | An evolution chain this item requires to produce a bay during mating. | [default to null] |
| **machines** | [**List**](ItemMachine.md) | A list of the machines related to this item. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

