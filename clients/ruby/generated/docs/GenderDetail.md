# PokeApiClient::GenderDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **pokemon_species_details** | [**Array&lt;GenderDetailPokemonSpeciesDetailsInner&gt;**](GenderDetailPokemonSpeciesDetailsInner.md) |  | [readonly] |
| **required_for_evolution** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] |

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

