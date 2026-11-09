# PokeApiClient::PokemonSpeciesGenus

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **genus** | **String** | The localized genus for the referenced Pokémon species |  |
| **language** | [**LanguageSummary**](LanguageSummary.md) | The language this genus is in. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonSpeciesGenus.new(
  genus: null,
  language: null
)
```

