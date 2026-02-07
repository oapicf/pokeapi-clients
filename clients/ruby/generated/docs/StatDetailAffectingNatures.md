# PokeApiClient::StatDetailAffectingNatures

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **increase** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  |  |
| **decrease** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::StatDetailAffectingNatures.new(
  increase: null,
  decrease: null
)
```

