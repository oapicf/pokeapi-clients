# PokeApiClient::PokemonFormType

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **slot** | **Integer** | The order the Pokémon&#39;s types are listed in. |  |
| **type** | [**TypeSummary**](TypeSummary.md) | The type the referenced Form has. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonFormType.new(
  slot: null,
  type: null
)
```

