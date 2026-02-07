# PokeApiClient::EvolutionChainDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **baby_trigger_item** | [**ItemSummary**](ItemSummary.md) |  |  |
| **chain** | [**EvolutionChainDetailChain**](EvolutionChainDetailChain.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::EvolutionChainDetail.new(
  id: null,
  baby_trigger_item: null,
  chain: null
)
```

