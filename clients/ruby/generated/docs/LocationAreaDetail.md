# PokeApiClient::LocationAreaDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **game_index** | **Integer** | The internal id of an API resource within game data. |  |
| **encounter_method_rates** | [**Array&lt;LocationAreaEncounterRate&gt;**](LocationAreaEncounterRate.md) | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. | [readonly] |
| **location** | [**LocationSummary**](LocationSummary.md) | The region this location area can be found in. |  |
| **names** | [**Array&lt;LocationAreaName&gt;**](LocationAreaName.md) | The name of this resource listed in different languages. | [readonly] |
| **pokemon_encounters** | [**Array&lt;LocationAreaPokemonEncounter&gt;**](LocationAreaPokemonEncounter.md) | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. | [readonly] |

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

