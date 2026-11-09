# PokeApiClient::PokemonPastType

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generation** | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced pokémon had the listed types. |  |
| **types** | [**Array&lt;PokemonType&gt;**](PokemonType.md) | The types the referenced pokémon had up to and including the listed generation. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonPastType.new(
  generation: null,
  types: null
)
```

