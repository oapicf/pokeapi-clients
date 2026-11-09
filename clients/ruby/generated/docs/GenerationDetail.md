# PokeApiClient::GenerationDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **abilities** | [**Array&lt;AbilitySummary&gt;**](AbilitySummary.md) | A list of abilities that were introduced in this generation. | [readonly] |
| **main_region** | [**RegionSummary**](RegionSummary.md) | The main region travelled in this generation. |  |
| **moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that were introduced in this generation. | [readonly] |
| **names** | [**Array&lt;GenerationName&gt;**](GenerationName.md) | The name of this resource listed in different languages. | [readonly] |
| **pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of Pokémon species that were introduced in this generation. | [readonly] |
| **types** | [**Array&lt;TypeSummary&gt;**](TypeSummary.md) | A list of types that were introduced in this generation. | [readonly] |
| **version_groups** | [**Array&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) | A list of version groups that were introduced in this generation. | [readonly] |

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

