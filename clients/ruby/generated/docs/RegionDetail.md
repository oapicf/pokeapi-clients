# PokeApiClient::RegionDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **locations** | [**Array&lt;LocationSummary&gt;**](LocationSummary.md) |  | [readonly] |
| **main_generation** | [**GenerationSummary**](GenerationSummary.md) |  | [readonly] |
| **names** | [**Array&lt;RegionName&gt;**](RegionName.md) |  | [readonly] |
| **pokedexes** | [**Array&lt;PokedexSummary&gt;**](PokedexSummary.md) |  | [readonly] |
| **version_groups** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::RegionDetail.new(
  id: null,
  name: null,
  locations: null,
  main_generation: null,
  names: null,
  pokedexes: null,
  version_groups: null
)
```

