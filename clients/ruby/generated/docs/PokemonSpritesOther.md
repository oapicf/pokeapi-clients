# PokeApiClient::PokemonSpritesOther

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **dream_world** | [**PokemonSpritesOtherDreamWorld**](PokemonSpritesOtherDreamWorld.md) | Pokémon Dream World artwork URLs. | [optional] |
| **home** | [**PokemonSpritesOtherHome**](PokemonSpritesOtherHome.md) | Pokémon HOME sprite URLs. | [optional] |
| **showdown** | [**PokemonSpritesOtherShowdown**](PokemonSpritesOtherShowdown.md) | Pokémon Showdown sprite URLs. | [optional] |
| **official_artwork** | [**PokemonSpritesOtherOfficialArtwork**](PokemonSpritesOtherOfficialArtwork.md) | Official Pokémon artwork URLs, including shiny artwork and version-specific variants. | [optional] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonSpritesOther.new(
  dream_world: null,
  home: null,
  showdown: null,
  official_artwork: null
)
```

