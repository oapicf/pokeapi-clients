# PokeApiClient::PokemonPastAbility

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **abilities** | [**Array&lt;PokemonAbilityPast&gt;**](PokemonAbilityPast.md) | The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty. |  |
| **generation** | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced pokémon had the listed abilities. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonPastAbility.new(
  abilities: null,
  generation: null
)
```

