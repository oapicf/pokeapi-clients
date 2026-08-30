# PokeApiClient::EvolutionTriggerDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **names** | [**Array&lt;EvolutionTriggerName&gt;**](EvolutionTriggerName.md) |  | [readonly] |
| **pokemon_species** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::EvolutionTriggerDetail.new(
  id: null,
  name: null,
  names: null,
  pokemon_species: null
)
```

