# PokeApiClient::PokemonSpritesOtherHome

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **front_default** | **String** | The URL of the default Pokémon HOME front image, or null if unavailable. |  |
| **front_female** | **String** | The URL of the female Pokémon HOME front image, or null if unavailable. |  |
| **front_shiny** | **String** | The URL of the shiny Pokémon HOME front image, or null if unavailable. |  |
| **front_shiny_female** | **String** | The URL of the shiny female Pokémon HOME front image, or null if unavailable. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonSpritesOtherHome.new(
  front_default: null,
  front_female: null,
  front_shiny: null,
  front_shiny_female: null
)
```

