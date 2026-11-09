# PokeApiClient::ItemDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **fling_power** | **Integer** | The power of the move Fling when used with this item. | [optional] |
| **fling_effect** | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) | The effect of the move Fling when used with this item. |  |
| **attributes** | [**Array&lt;ItemAttributeSummary&gt;**](ItemAttributeSummary.md) | A list of attributes this item has. | [readonly] |
| **category** | [**ItemCategorySummary**](ItemCategorySummary.md) | The category of items this item falls into. |  |
| **effect_entries** | [**Array&lt;ItemEffectText&gt;**](ItemEffectText.md) | The effect of this ability listed in different languages. | [readonly] |
| **flavor_text_entries** | [**Array&lt;ItemFlavorText&gt;**](ItemFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] |
| **game_indices** | [**Array&lt;ItemGameIndex&gt;**](ItemGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] |
| **prices** | [**Array&lt;ItemPrice&gt;**](ItemPrice.md) | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. | [readonly] |
| **names** | [**Array&lt;ItemName&gt;**](ItemName.md) | The name of this item listed in different languages. | [readonly] |
| **held_by_pokemon** | [**Array&lt;PokemonHeldItem&gt;**](PokemonHeldItem.md) | A list of Pokémon that might be found in the wild holding this item. | [readonly] |
| **sprites** | [**ItemSprites**](ItemSprites.md) | A set of sprites used to depict this item in the game. | [readonly] |
| **baby_trigger_for** | [**EvolutionChainSummary**](EvolutionChainSummary.md) | An evolution chain this item requires to produce a bay during mating. | [readonly] |
| **machines** | [**Array&lt;ItemMachine&gt;**](ItemMachine.md) | A list of the machines related to this item. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::ItemDetail.new(
  id: null,
  name: null,
  fling_power: null,
  fling_effect: null,
  attributes: null,
  category: null,
  effect_entries: null,
  flavor_text_entries: null,
  game_indices: null,
  prices: null,
  names: null,
  held_by_pokemon: null,
  sprites: null,
  baby_trigger_for: null,
  machines: null
)
```

