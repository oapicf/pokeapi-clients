# PokeApiClient::AbilityPokemonDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **is_hidden** | **Boolean** | Whether or not this a hidden ability for the referenced Pokémon. | [optional] |
| **slot** | **Integer** | Pokémon have 3 ability &#39;slots&#39; which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon. |  |
| **pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon this ability could belong to. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::AbilityPokemonDetail.new(
  is_hidden: null,
  slot: null,
  pokemon: null
)
```

