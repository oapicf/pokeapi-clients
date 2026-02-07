# PokeApiClient::PokemonDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **base_experience** | **Integer** |  | [optional] |
| **height** | **Integer** |  | [optional] |
| **is_default** | **Boolean** |  | [optional] |
| **order** | **Integer** |  | [optional] |
| **weight** | **Integer** |  | [optional] |
| **abilities** | [**Array&lt;PokemonDetailAbilitiesInner&gt;**](PokemonDetailAbilitiesInner.md) |  |  |
| **past_abilities** | [**Array&lt;PokemonDetailPastAbilitiesInner&gt;**](PokemonDetailPastAbilitiesInner.md) |  |  |
| **forms** | [**Array&lt;PokemonFormSummary&gt;**](PokemonFormSummary.md) |  |  |
| **game_indices** | [**Array&lt;PokemonGameIndex&gt;**](PokemonGameIndex.md) |  |  |
| **held_items** | [**PokemonDetailHeldItems**](PokemonDetailHeldItems.md) |  |  |
| **location_area_encounters** | **String** |  | [readonly] |
| **moves** | [**Array&lt;PokemonDetailMovesInner&gt;**](PokemonDetailMovesInner.md) |  |  |
| **species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  |  |
| **sprites** | [**PokemonDetailSprites**](PokemonDetailSprites.md) |  |  |
| **cries** | [**PokemonDetailCries**](PokemonDetailCries.md) |  |  |
| **stats** | [**Array&lt;PokemonStat&gt;**](PokemonStat.md) |  |  |
| **types** | [**Array&lt;PokemonDetailTypesInner&gt;**](PokemonDetailTypesInner.md) |  |  |
| **past_types** | [**Array&lt;PokemonDetailPastTypesInner&gt;**](PokemonDetailPastTypesInner.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonDetail.new(
  id: null,
  name: null,
  base_experience: null,
  height: null,
  is_default: null,
  order: null,
  weight: null,
  abilities: null,
  past_abilities: null,
  forms: null,
  game_indices: null,
  held_items: null,
  location_area_encounters: null,
  moves: null,
  species: null,
  sprites: null,
  cries: null,
  stats: null,
  types: null,
  past_types: null
)
```

