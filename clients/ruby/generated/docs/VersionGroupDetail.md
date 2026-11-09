# PokeApiClient::VersionGroupDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **order** | **Integer** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional] |
| **generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. |  |
| **move_learn_methods** | [**Array&lt;MoveLearnMethodSummary&gt;**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. | [readonly] |
| **pokedexes** | [**Array&lt;PokedexSummary&gt;**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. | [readonly] |
| **regions** | [**Array&lt;RegionSummary&gt;**](RegionSummary.md) | A list of regions that can be visited in this version group. | [readonly] |
| **versions** | [**Array&lt;VersionSummary&gt;**](VersionSummary.md) | The versions this version group owns. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::VersionGroupDetail.new(
  id: null,
  name: null,
  order: null,
  generation: null,
  move_learn_methods: null,
  pokedexes: null,
  regions: null,
  versions: null
)
```

