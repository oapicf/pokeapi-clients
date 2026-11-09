# PokeApiClient::GenderPokemonSpecies

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **rate** | **Integer** | The chance of this Pokémon being female, in eighths; or -1 for genderless. |  |
| **pokemon_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | A Pokémon species that can be the referenced gender. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::GenderPokemonSpecies.new(
  rate: null,
  pokemon_species: null
)
```

