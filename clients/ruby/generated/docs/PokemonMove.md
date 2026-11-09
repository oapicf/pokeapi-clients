# PokeApiClient::PokemonMove

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **move** | [**MoveSummary**](MoveSummary.md) | The move the Pokémon can learn. |  |
| **version_group_details** | [**Array&lt;PokemonMoveVersionGroup&gt;**](PokemonMoveVersionGroup.md) | The details of the version in which the Pokémon can learn the move. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonMove.new(
  move: null,
  version_group_details: null
)
```

