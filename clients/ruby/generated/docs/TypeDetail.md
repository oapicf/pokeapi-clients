# PokeApiClient::TypeDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **damage_relations** | [**TypeRelationships**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. | [readonly] |
| **past_damage_relations** | [**Array&lt;TypePastRelationships&gt;**](TypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations | [readonly] |
| **game_indices** | [**Array&lt;TypeGameIndex&gt;**](TypeGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] |
| **generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this type was introduced in. |  |
| **move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. |  |
| **names** | [**Array&lt;TypeName&gt;**](TypeName.md) | The name of this resource listed in different languages. | [readonly] |
| **pokemon** | [**Array&lt;TypePokemon&gt;**](TypePokemon.md) | A list of details of Pokémon that have this type. | [readonly] |
| **moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that have this type. | [readonly] |
| **sprites** | **Hash&lt;String, Hash&lt;String, TypeGameSprite&gt;&gt;** | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. | [readonly] |

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

