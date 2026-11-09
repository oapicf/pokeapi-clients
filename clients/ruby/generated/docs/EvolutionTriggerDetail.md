# PokeApiClient::EvolutionTriggerDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **names** | [**Array&lt;EvolutionTriggerName&gt;**](EvolutionTriggerName.md) | The name of this resource listed in different languages. | [readonly] |
| **pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of pokemon species that result from this evolution trigger. | [readonly] |

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

