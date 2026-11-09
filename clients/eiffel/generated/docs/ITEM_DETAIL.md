# ITEM_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**fling_power** | **INTEGER_32** | The power of the move Fling when used with this item. | [optional] [default to null]
**fling_effect** | [**ITEM_FLING_EFFECT_SUMMARY**](ItemFlingEffectSummary.md) | The effect of the move Fling when used with this item. | [default to null]
**attributes** | [**LIST [ITEM_ATTRIBUTE_SUMMARY]**](ItemAttributeSummary.md) | A list of attributes this item has. | [readonly] [default to null]
**category** | [**ITEM_CATEGORY_SUMMARY**](ItemCategorySummary.md) | The category of items this item falls into. | [default to null]
**effect_entries** | [**LIST [ITEM_EFFECT_TEXT]**](ItemEffectText.md) | The effect of this ability listed in different languages. | [readonly] [default to null]
**flavor_text_entries** | [**LIST [ITEM_FLAVOR_TEXT]**](ItemFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] [default to null]
**game_indices** | [**LIST [ITEM_GAME_INDEX]**](ItemGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] [default to null]
**prices** | [**LIST [ITEM_PRICE]**](ItemPrice.md) | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. | [readonly] [default to null]
**names** | [**LIST [ITEM_NAME]**](ItemName.md) | The name of this item listed in different languages. | [readonly] [default to null]
**held_by_pokemon** | [**LIST [POKEMON_HELD_ITEM]**](PokemonHeldItem.md) | A list of Pokémon that might be found in the wild holding this item. | [readonly] [default to null]
**sprites** | [**ITEM_SPRITES**](ItemSprites.md) | A set of sprites used to depict this item in the game. | [readonly] [default to null]
**baby_trigger_for** | [**EVOLUTION_CHAIN_SUMMARY**](EvolutionChainSummary.md) | An evolution chain this item requires to produce a bay during mating. | [readonly] [default to null]
**machines** | [**LIST [ITEM_MACHINE]**](ItemMachine.md) | A list of the machines related to this item. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


