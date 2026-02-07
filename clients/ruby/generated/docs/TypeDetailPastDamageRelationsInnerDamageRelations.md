# PokeApiClient::TypeDetailPastDamageRelationsInnerDamageRelations

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **no_damage_to** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  |  |
| **half_damage_to** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  |  |
| **double_damage_to** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  |  |
| **no_damage_from** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  |  |
| **half_damage_from** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  |  |
| **double_damage_from** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::TypeDetailPastDamageRelationsInnerDamageRelations.new(
  no_damage_to: null,
  half_damage_to: null,
  double_damage_to: null,
  no_damage_from: null,
  half_damage_from: null,
  double_damage_from: null
)
```

