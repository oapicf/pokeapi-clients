# PokeApiClient::ItemFlingEffectDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **effect_entries** | [**Array&lt;ItemFlingEffectEffectText&gt;**](ItemFlingEffectEffectText.md) | The result of this fling effect listed in different languages. | [readonly] |
| **items** | [**Array&lt;ItemSummary&gt;**](ItemSummary.md) | A list of items that have this fling effect. | [readonly] |

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

