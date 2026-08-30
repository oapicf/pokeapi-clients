# PokeApiClient::PokemonShapeDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **awesome_names** | [**Array&lt;PokemonShapeDetailAwesomeNamesInner&gt;**](PokemonShapeDetailAwesomeNamesInner.md) |  | [readonly] |
| **names** | [**Array&lt;PokemonShapeDetailNamesInner&gt;**](PokemonShapeDetailNamesInner.md) |  | [readonly] |
| **pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) |  | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonShapeDetail.new(
  id: null,
  name: null,
  awesome_names: null,
  names: null,
  pokemon_species: null
)
```

