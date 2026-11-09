# PokeApiClient::PokemonHabitatDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **names** | [**Array&lt;PokemonHabitatName&gt;**](PokemonHabitatName.md) | The name of this resource listed in different languages. | [readonly] |
| **pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of the Pokémon species that can be found in this habitat. | [readonly] |

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

