# PokeApiClient::PokemonMoveVersionGroup

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **level_learned_at** | **Integer** | The minimum level to learn the move. |  |
| **move_learn_method** | [**MoveLearnMethodSummary**](MoveLearnMethodSummary.md) | The method by which the move is learned. |  |
| **version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which the move is learned. |  |
| **order** | **Integer** | Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order. | [optional] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonMoveVersionGroup.new(
  level_learned_at: null,
  move_learn_method: null,
  version_group: null,
  order: null
)
```

