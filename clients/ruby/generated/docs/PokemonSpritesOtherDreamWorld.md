# PokeApiClient::PokemonSpritesOtherDreamWorld

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **front_default** | **String** | The URL of the default Pokémon Dream World front image, or null if unavailable. |  |
| **front_female** | **String** | The URL of the female Pokémon Dream World front image, or null if unavailable. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonSpritesOtherDreamWorld.new(
  front_default: null,
  front_female: null
)
```

