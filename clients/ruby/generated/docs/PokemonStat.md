# PokeApiClient::PokemonStat

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **base_stat** | **Integer** | The base value of the stat. |  |
| **effort** | **Integer** | The effort points (EV) the Pokémon has in the stat. |  |
| **stat** | [**StatSummary**](StatSummary.md) | The stat the Pokémon has. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonStat.new(
  base_stat: null,
  effort: null,
  stat: null
)
```

