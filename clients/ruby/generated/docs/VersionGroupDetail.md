# PokeApiClient::VersionGroupDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **order** | **Integer** |  | [optional] |
| **generation** | [**GenerationSummary**](GenerationSummary.md) |  |  |
| **move_learn_methods** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] |
| **pokedexes** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] |
| **regions** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] |
| **versions** | [**Array&lt;VersionSummary&gt;**](VersionSummary.md) |  | [readonly] |

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

