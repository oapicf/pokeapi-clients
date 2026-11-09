# PokeApiClient::PokemonDexNumber

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **entry_number** | **Integer** | The index of this Pokémon species entry within the Pokédex. |  |
| **pokemon_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species being encountered. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonDexNumber.new(
  entry_number: null,
  pokemon_species: null
)
```

