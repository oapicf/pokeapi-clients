# PokeApiClient::PokemonEncounterResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **location_area** | [**LocationAreaSummary**](LocationAreaSummary.md) | The location area the referenced Pokémon can be encountered in. |  |
| **version_details** | [**Array&lt;PokemonEncounterVersionDetailResponse&gt;**](PokemonEncounterVersionDetailResponse.md) | A list of versions and encounters with the referenced Pokémon that might happen. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonEncounterResponse.new(
  location_area: null,
  version_details: null
)
```

