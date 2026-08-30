# PokeApiClient::ItemDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **cost** | **Integer** |  | [optional] |
| **fling_power** | **Integer** |  | [optional] |
| **fling_effect** | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) |  |  |
| **attributes** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] |
| **category** | [**ItemCategorySummary**](ItemCategorySummary.md) |  |  |
| **effect_entries** | [**Array&lt;ItemEffectText&gt;**](ItemEffectText.md) |  | [readonly] |
| **flavor_text_entries** | [**Array&lt;ItemFlavorText&gt;**](ItemFlavorText.md) |  | [readonly] |
| **game_indices** | [**Array&lt;ItemGameIndex&gt;**](ItemGameIndex.md) |  | [readonly] |
| **names** | [**Array&lt;ItemName&gt;**](ItemName.md) |  | [readonly] |
| **held_by_pokemon** | [**Array&lt;ItemDetailHeldByPokemonInner&gt;**](ItemDetailHeldByPokemonInner.md) |  | [readonly] |
| **sprites** | [**ItemDetailSprites**](ItemDetailSprites.md) |  |  |
| **baby_trigger_for** | [**ItemDetailBabyTriggerFor**](ItemDetailBabyTriggerFor.md) |  |  |
| **machines** | [**Array&lt;ItemDetailMachinesInner&gt;**](ItemDetailMachinesInner.md) |  | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::ItemDetail.new(
  id: null,
  name: null,
  cost: null,
  fling_power: null,
  fling_effect: null,
  attributes: null,
  category: null,
  effect_entries: null,
  flavor_text_entries: null,
  game_indices: null,
  names: null,
  held_by_pokemon: null,
  sprites: null,
  baby_trigger_for: null,
  machines: null
)
```

