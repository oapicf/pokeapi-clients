# PokeApiClient::LocationAreaEncounterDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **min_level** | **Integer** | The lowest level the Pokémon could be encountered at. |  |
| **max_level** | **Integer** | The highest level the Pokémon could be encountered at. |  |
| **chance** | **Integer** | Percent chance that this encounter will occur. | [optional][default to 0] |
| **method** | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method by which this encounter happens. | [optional] |
| **condition_values** | [**Array&lt;EncounterConditionValueSummary&gt;**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | [readonly] |
| **pokemon_details** | [**EncounterPokemonDetail**](EncounterPokemonDetail.md) | Additional properties of the encountered Pokémon, or null if unspecified. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::LocationAreaEncounterDetail.new(
  min_level: null,
  max_level: null,
  chance: null,
  method: null,
  condition_values: null,
  pokemon_details: null
)
```

