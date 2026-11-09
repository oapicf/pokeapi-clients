# PokeApiClient::ContestEffectDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **appeal** | **Integer** | The base number of hearts the user of this move gets. |  |
| **jam** | **Integer** | The base number of hearts the user&#39;s opponent loses. |  |
| **effect_entries** | [**Array&lt;ContestEffectEffectText&gt;**](ContestEffectEffectText.md) | The result of this contest effect listed in different languages. | [readonly] |
| **flavor_text_entries** | [**Array&lt;ContestEffectFlavorText&gt;**](ContestEffectFlavorText.md) | The flavor text of this contest effect listed in different languages. | [readonly] |

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

