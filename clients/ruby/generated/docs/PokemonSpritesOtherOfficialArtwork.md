# PokeApiClient::PokemonSpritesOtherOfficialArtwork

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **front_default** | **String** | The URL of the default front official artwork, or null if unavailable. |  |
| **front_shiny** | **String** | The URL of the shiny front official artwork, or null if unavailable. |  |
| **versions** | **Hash&lt;String, Hash&lt;String, Object&gt;&gt;** | Additional official artwork grouped by version. Available keys vary by resource. | [optional] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonSpritesOtherOfficialArtwork.new(
  front_default: null,
  front_shiny: null,
  versions: null
)
```

