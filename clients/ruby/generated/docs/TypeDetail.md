# PokeApiClient::TypeDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **damage_relations** | [**TypeDetailDamageRelations**](TypeDetailDamageRelations.md) |  |  |
| **past_damage_relations** | [**Array&lt;TypeDetailPastDamageRelationsInner&gt;**](TypeDetailPastDamageRelationsInner.md) |  |  |
| **game_indices** | [**Array&lt;TypeGameIndex&gt;**](TypeGameIndex.md) |  |  |
| **generation** | [**GenerationSummary**](GenerationSummary.md) |  |  |
| **move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  |  |
| **names** | [**Array&lt;AbilityName&gt;**](AbilityName.md) |  |  |
| **pokemon** | [**Array&lt;TypeDetailPokemonInner&gt;**](TypeDetailPokemonInner.md) |  |  |
| **moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) |  |  |
| **sprites** | **Hash&lt;String, Hash&lt;String, TypeDetailSpritesValueValue&gt;&gt;** |  | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::TypeDetail.new(
  id: null,
  name: null,
  damage_relations: null,
  past_damage_relations: null,
  game_indices: null,
  generation: null,
  move_damage_class: null,
  names: null,
  pokemon: null,
  moves: null,
  sprites: null
)
```

