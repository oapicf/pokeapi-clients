# PokeApiClient::PokemonType

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **slot** | **Integer** | The order the Pokémon&#39;s types are listed in. |  |
| **type** | [**TypeSummary**](TypeSummary.md) | The type the referenced Pokémon has. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonType.new(
  slot: null,
  type: null
)
```

