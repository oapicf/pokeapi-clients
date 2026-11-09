# PokeApiClient::TypePastRelationships

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generation** | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced type had the listed damage relations |  |
| **damage_relations** | [**TypeRelationships**](TypeRelationships.md) | The damage relations the referenced type had up to and including the listed generation |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::TypePastRelationships.new(
  generation: null,
  damage_relations: null
)
```

