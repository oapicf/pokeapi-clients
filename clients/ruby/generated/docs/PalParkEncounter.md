# PokeApiClient::PalParkEncounter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **base_score** | **Integer** | The base score given to the player when this Pokémon is caught during a pal park run. | [optional] |
| **rate** | **Integer** | The base rate for encountering this Pokémon in this pal park area. |  |
| **pokemon_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species being encountered. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PalParkEncounter.new(
  base_score: null,
  rate: null,
  pokemon_species: null
)
```

