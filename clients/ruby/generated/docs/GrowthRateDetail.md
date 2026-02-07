# PokeApiClient::GrowthRateDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **formula** | **String** |  |  |
| **descriptions** | [**Array&lt;GrowthRateDescription&gt;**](GrowthRateDescription.md) |  |  |
| **levels** | [**Array&lt;Experience&gt;**](Experience.md) |  |  |
| **pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::GrowthRateDetail.new(
  id: null,
  name: null,
  formula: null,
  descriptions: null,
  levels: null,
  pokemon_species: null
)
```

