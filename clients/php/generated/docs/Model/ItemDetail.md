# ItemDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly]
**name** | **string** | The name for this resource. |
**fling_power** | **int** | The power of the move Fling when used with this item. | [optional]
**fling_effect** | [**\OpenAPI\Client\Model\ItemFlingEffectSummary**](ItemFlingEffectSummary.md) | The effect of the move Fling when used with this item. |
**attributes** | [**\OpenAPI\Client\Model\ItemAttributeSummary[]**](ItemAttributeSummary.md) | A list of attributes this item has. | [readonly]
**category** | [**\OpenAPI\Client\Model\ItemCategorySummary**](ItemCategorySummary.md) | The category of items this item falls into. |
**effect_entries** | [**\OpenAPI\Client\Model\ItemEffectText[]**](ItemEffectText.md) | The effect of this ability listed in different languages. | [readonly]
**flavor_text_entries** | [**\OpenAPI\Client\Model\ItemFlavorText[]**](ItemFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly]
**game_indices** | [**\OpenAPI\Client\Model\ItemGameIndex[]**](ItemGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly]
**prices** | [**\OpenAPI\Client\Model\ItemPrice[]**](ItemPrice.md) | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. | [readonly]
**names** | [**\OpenAPI\Client\Model\ItemName[]**](ItemName.md) | The name of this item listed in different languages. | [readonly]
**held_by_pokemon** | [**\OpenAPI\Client\Model\PokemonHeldItem[]**](PokemonHeldItem.md) | A list of Pokémon that might be found in the wild holding this item. | [readonly]
**sprites** | [**\OpenAPI\Client\Model\ItemSprites**](ItemSprites.md) | A set of sprites used to depict this item in the game. | [readonly]
**baby_trigger_for** | [**\OpenAPI\Client\Model\EvolutionChainSummary**](EvolutionChainSummary.md) | An evolution chain this item requires to produce a bay during mating. | [readonly]
**machines** | [**\OpenAPI\Client\Model\ItemMachine[]**](ItemMachine.md) | A list of the machines related to this item. | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
