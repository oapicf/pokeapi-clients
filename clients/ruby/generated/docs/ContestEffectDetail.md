# PokeApiClient::ContestEffectDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **appeal** | **Integer** |  |  |
| **jam** | **Integer** |  |  |
| **effect_entries** | [**Array&lt;ContestEffectEffectText&gt;**](ContestEffectEffectText.md) |  |  |
| **flavor_text_entries** | [**Array&lt;ContestEffectFlavorText&gt;**](ContestEffectFlavorText.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::ContestEffectDetail.new(
  id: null,
  appeal: null,
  jam: null,
  effect_entries: null,
  flavor_text_entries: null
)
```

