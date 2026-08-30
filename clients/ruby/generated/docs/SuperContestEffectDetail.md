# PokeApiClient::SuperContestEffectDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **appeal** | **Integer** |  |  |
| **flavor_text_entries** | [**Array&lt;SuperContestEffectFlavorText&gt;**](SuperContestEffectFlavorText.md) |  | [readonly] |
| **moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) |  | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::SuperContestEffectDetail.new(
  id: null,
  appeal: null,
  flavor_text_entries: null,
  moves: null
)
```

