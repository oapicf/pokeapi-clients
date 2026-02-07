# PokeApiClient::PokemonHabitatDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **names** | [**Array&lt;PokemonHabitatName&gt;**](PokemonHabitatName.md) |  |  |
| **pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonHabitatDetail.new(
  id: null,
  name: null,
  names: null,
  pokemon_species: null
)
```

