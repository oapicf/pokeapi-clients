# PokeApiClient::GenerationDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **abilities** | [**Array&lt;AbilitySummary&gt;**](AbilitySummary.md) |  | [readonly] |
| **main_region** | [**RegionSummary**](RegionSummary.md) |  |  |
| **moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) |  | [readonly] |
| **names** | [**Array&lt;GenerationName&gt;**](GenerationName.md) |  | [readonly] |
| **pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) |  | [readonly] |
| **types** | [**Array&lt;TypeSummary&gt;**](TypeSummary.md) |  | [readonly] |
| **version_groups** | [**Array&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) |  | [readonly] |

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

