# PokeApiClient::ItemFlingEffectDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **effect_entries** | [**Array&lt;ItemFlingEffectEffectText&gt;**](ItemFlingEffectEffectText.md) |  |  |
| **items** | [**Array&lt;ItemSummary&gt;**](ItemSummary.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::ItemFlingEffectDetail.new(
  id: null,
  name: null,
  effect_entries: null,
  items: null
)
```

