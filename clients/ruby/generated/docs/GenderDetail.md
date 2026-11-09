# PokeApiClient::GenderDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **pokemon_species_details** | [**Array&lt;GenderPokemonSpecies&gt;**](GenderPokemonSpecies.md) | A list of Pokémon species that can be this gender and how likely it is that they will be. | [readonly] |
| **required_for_evolution** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of Pokémon species that required this gender in order for a Pokémon to evolve into them. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::GenderDetail.new(
  id: null,
  name: null,
  pokemon_species_details: null,
  required_for_evolution: null
)
```

