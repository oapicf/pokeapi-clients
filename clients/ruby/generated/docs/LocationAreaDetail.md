# PokeApiClient::LocationAreaDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **game_index** | **Integer** |  |  |
| **encounter_method_rates** | [**Array&lt;LocationAreaDetailEncounterMethodRatesInner&gt;**](LocationAreaDetailEncounterMethodRatesInner.md) |  |  |
| **location** | [**LocationSummary**](LocationSummary.md) |  |  |
| **names** | [**Array&lt;LocationAreaName&gt;**](LocationAreaName.md) |  |  |
| **pokemon_encounters** | [**Array&lt;LocationAreaDetailPokemonEncountersInner&gt;**](LocationAreaDetailPokemonEncountersInner.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::LocationAreaDetail.new(
  id: null,
  name: null,
  game_index: null,
  encounter_method_rates: null,
  location: null,
  names: null,
  pokemon_encounters: null
)
```

