# PokeApiClient::EncounterPokemonDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **min_perfect_ivs** | **Integer** | The minimum number of perfect IVs, or null if unspecified. | [optional] |
| **always_shiny** | **Boolean** | Whether the encountered Pokémon is always shiny. | [optional] |
| **never_shiny** | **Boolean** | Whether the encountered Pokémon can never be shiny. | [optional] |
| **is_alpha** | **Boolean** | Whether the encountered Pokémon is an alpha Pokémon. | [optional] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::EncounterPokemonDetail.new(
  min_perfect_ivs: null,
  always_shiny: null,
  never_shiny: null,
  is_alpha: null
)
```

