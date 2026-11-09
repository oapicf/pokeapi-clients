# PokeApiClient::LocationAreaPokemonEncounter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon being encountered. |  |
| **version_details** | [**Array&lt;LocationAreaPokemonEncounterVersion&gt;**](LocationAreaPokemonEncounterVersion.md) | A list of versions and encounters with Pokémon that might happen in the referenced location area. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::LocationAreaPokemonEncounter.new(
  pokemon: null,
  version_details: null
)
```

