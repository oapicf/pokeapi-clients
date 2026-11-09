# PokeApiClient::EggGroupDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **names** | [**Array&lt;EggGroupName&gt;**](EggGroupName.md) | The name of this resource listed in different languages. | [readonly] |
| **pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of all Pokémon species that are members of this egg group. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::EggGroupDetail.new(
  id: null,
  name: null,
  names: null,
  pokemon_species: null
)
```

