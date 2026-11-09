# PokeApiClient::LocationAreaEncounterRate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **encounter_method** | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method in which Pokémon may be encountered in an area.. |  |
| **version_details** | [**Array&lt;LocationAreaEncounterVersionDetail&gt;**](LocationAreaEncounterVersionDetail.md) | The chance of the encounter to occur on a version of the game. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::LocationAreaEncounterRate.new(
  encounter_method: null,
  version_details: null
)
```

