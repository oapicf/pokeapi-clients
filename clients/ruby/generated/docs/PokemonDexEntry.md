# PokeApiClient::PokemonDexEntry

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **entry_number** | **Integer** | The index number within the Pokédex. |  |
| **pokedex** | [**PokedexSummary**](PokedexSummary.md) | The Pokédex the referenced Pokémon species can be found in. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonDexEntry.new(
  entry_number: null,
  pokedex: null
)
```

