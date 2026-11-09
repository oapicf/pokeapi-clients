# PokeApiClient::GrowthRateDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **formula** | **String** | The formula used to calculate the rate at which the Pokémon species gains level. |  |
| **descriptions** | [**Array&lt;GrowthRateDescription&gt;**](GrowthRateDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] |
| **levels** | [**Array&lt;Experience&gt;**](Experience.md) | A list of levels and the amount of experienced needed to atain them based on this growth rate. | [readonly] |
| **pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of Pokémon species that gain levels at this growth rate. | [readonly] |

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

