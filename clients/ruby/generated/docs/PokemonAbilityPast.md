# PokeApiClient::PokemonAbilityPast

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **is_hidden** | **Boolean** | Whether or not this is a hidden ability. | [optional] |
| **slot** | **Integer** | The slot this ability occupies in this Pokémon species. |  |
| **ability** | [**AbilitySummary**](AbilitySummary.md) | The ability the Pokémon may have. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonAbilityPast.new(
  is_hidden: null,
  slot: null,
  ability: null
)
```

