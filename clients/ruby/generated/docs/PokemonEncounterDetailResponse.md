# PokeApiClient::PokemonEncounterDetailResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **chance** | **Integer** | Percent chance that this encounter will occur. |  |
| **condition_values** | [**Array&lt;EncounterConditionValueSummary&gt;**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. |  |
| **max_level** | **Integer** | The highest level the Pokémon could be encountered at. |  |
| **method** | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method by which this encounter happens. |  |
| **min_level** | **Integer** | The lowest level the Pokémon could be encountered at. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonEncounterDetailResponse.new(
  chance: null,
  condition_values: null,
  max_level: null,
  method: null,
  min_level: null
)
```

