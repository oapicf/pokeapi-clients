# PokeApiClient::PokemonSprites

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **front_default** | **String** | The default depiction of this Pokémon from the front in battle. |  |
| **front_shiny** | **String** | The shiny depiction of this Pokémon from the front in battle. |  |
| **front_female** | **String** | The female depiction of this Pokémon from the front in battle. |  |
| **front_shiny_female** | **String** | The shiny female depiction of this Pokémon from the front in battle. |  |
| **back_default** | **String** | The default depiction of this Pokémon from the back in battle. |  |
| **back_shiny** | **String** | The shiny depiction of this Pokémon from the back in battle. |  |
| **back_female** | **String** | The female depiction of this Pokémon from the back in battle. |  |
| **back_shiny_female** | **String** | The shiny female depiction of this Pokémon from the back in battle. |  |
| **other** | [**PokemonSpritesOther**](PokemonSpritesOther.md) | Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource. | [optional] |
| **versions** | **Hash&lt;String, Hash&lt;String, Object&gt;&gt;** | Sprites grouped by generation and game. Available keys vary by resource. | [optional] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonSprites.new(
  front_default: null,
  front_shiny: null,
  front_female: null,
  front_shiny_female: null,
  back_default: null,
  back_shiny: null,
  back_female: null,
  back_shiny_female: null,
  other: null,
  versions: null
)
```

