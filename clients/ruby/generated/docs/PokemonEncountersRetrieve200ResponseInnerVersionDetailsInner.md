# PokeApiClient::PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **encounter_details** | [**Array&lt;PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner&gt;**](PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner.md) |  |  |
| **max_chance** | **Float** |  |  |
| **version** | [**PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion**](PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner.new(
  encounter_details: null,
  max_chance: 100,
  version: null
)
```

