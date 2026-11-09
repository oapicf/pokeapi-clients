# PokeApiClient::PokemonSpritesOtherShowdown

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **front_default** | **String** | The URL of the default Pokémon Showdown front image, or null if unavailable. |  |
| **front_female** | **String** | The URL of the female Pokémon Showdown front image, or null if unavailable. |  |
| **front_shiny** | **String** | The URL of the shiny Pokémon Showdown front image, or null if unavailable. |  |
| **front_shiny_female** | **String** | The URL of the shiny female Pokémon Showdown front image, or null if unavailable. |  |
| **back_default** | **String** | The URL of the default Pokémon Showdown back image, or null if unavailable. |  |
| **back_female** | **String** | The URL of the female Pokémon Showdown back image, or null if unavailable. |  |
| **back_shiny** | **String** | The URL of the shiny Pokémon Showdown back image, or null if unavailable. |  |
| **back_shiny_female** | **String** | The URL of the shiny female Pokémon Showdown back image, or null if unavailable. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonSpritesOtherShowdown.new(
  front_default: null,
  front_female: null,
  front_shiny: null,
  front_shiny_female: null,
  back_default: null,
  back_female: null,
  back_shiny: null,
  back_shiny_female: null
)
```

