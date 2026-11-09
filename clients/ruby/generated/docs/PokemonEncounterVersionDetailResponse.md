# PokeApiClient::PokemonEncounterVersionDetailResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **version** | [**VersionSummary**](VersionSummary.md) | The game version this encounter happens in. |  |
| **max_chance** | **Integer** | The total percentage of all encounter potential. |  |
| **encounter_details** | [**Array&lt;PokemonEncounterDetailResponse&gt;**](PokemonEncounterDetailResponse.md) | A list of encounters and their specifics. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonEncounterVersionDetailResponse.new(
  version: null,
  max_chance: null,
  encounter_details: null
)
```

