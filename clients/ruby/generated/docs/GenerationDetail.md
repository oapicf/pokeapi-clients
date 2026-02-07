# PokeApiClient::GenerationDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **abilities** | [**Array&lt;AbilitySummary&gt;**](AbilitySummary.md) |  |  |
| **main_region** | [**RegionSummary**](RegionSummary.md) |  |  |
| **moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) |  |  |
| **names** | [**Array&lt;GenerationName&gt;**](GenerationName.md) |  |  |
| **pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) |  |  |
| **types** | [**Array&lt;TypeSummary&gt;**](TypeSummary.md) |  |  |
| **version_groups** | [**Array&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::GenerationDetail.new(
  id: null,
  name: null,
  abilities: null,
  main_region: null,
  moves: null,
  names: null,
  pokemon_species: null,
  types: null,
  version_groups: null
)
```

