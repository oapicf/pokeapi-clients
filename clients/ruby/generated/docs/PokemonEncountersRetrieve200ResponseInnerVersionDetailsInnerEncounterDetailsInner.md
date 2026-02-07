# PokeApiClient::PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **chance** | **Float** |  |  |
| **condition_values** | [**Array&lt;PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner&gt;**](PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner.md) |  |  |
| **max_level** | **Float** |  |  |
| **method** | [**PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod**](PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod.md) |  |  |
| **min_level** | **Float** |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.new(
  chance: 100,
  condition_values: null,
  max_level: 10,
  method: null,
  min_level: 10
)
```

