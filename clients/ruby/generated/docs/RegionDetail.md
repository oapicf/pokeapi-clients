# PokeApiClient::RegionDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **locations** | [**Array&lt;LocationSummary&gt;**](LocationSummary.md) |  |  |
| **main_generation** | [**GenerationSummary**](GenerationSummary.md) |  | [readonly] |
| **names** | [**Array&lt;RegionName&gt;**](RegionName.md) |  |  |
| **pokedexes** | [**Array&lt;PokedexSummary&gt;**](PokedexSummary.md) |  |  |
| **version_groups** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  |  |

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

