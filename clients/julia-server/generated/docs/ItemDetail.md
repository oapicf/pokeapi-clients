# ItemDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`fling_power`** | **`Int64`** | The power of the move Fling when used with this item. | [optional] [default to nothing]
**`fling_effect`** | [**`*ItemFlingEffectSummary`**](ItemFlingEffectSummary.md) | The effect of the move Fling when used with this item. | [default to nothing]
**`attributes`** | [**`Vector{ItemAttributeSummary}`**](ItemAttributeSummary.md) | A list of attributes this item has. | [readonly] [default to nothing]
**`category`** | [**`*ItemCategorySummary`**](ItemCategorySummary.md) | The category of items this item falls into. | [default to nothing]
**`effect_entries`** | [**`Vector{ItemEffectText}`**](ItemEffectText.md) | The effect of this ability listed in different languages. | [readonly] [default to nothing]
**`flavor_text_entries`** | [**`Vector{ItemFlavorText}`**](ItemFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] [default to nothing]
**`game_indices`** | [**`Vector{ItemGameIndex}`**](ItemGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] [default to nothing]
**`prices`** | [**`Vector{ItemPrice}`**](ItemPrice.md) | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. | [readonly] [default to nothing]
**`names`** | [**`Vector{ItemName}`**](ItemName.md) | The name of this item listed in different languages. | [readonly] [default to nothing]
**`held_by_pokemon`** | [**`Vector{PokemonHeldItem}`**](PokemonHeldItem.md) | A list of Pokémon that might be found in the wild holding this item. | [readonly] [default to nothing]
**`sprites`** | [**`*ItemSprites`**](ItemSprites.md) | A set of sprites used to depict this item in the game. | [readonly] [default to nothing]
**`baby_trigger_for`** | [**`*EvolutionChainSummary`**](EvolutionChainSummary.md) | An evolution chain this item requires to produce a bay during mating. | [readonly] [default to nothing]
**`machines`** | [**`Vector{ItemMachine}`**](ItemMachine.md) | A list of the machines related to this item. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


