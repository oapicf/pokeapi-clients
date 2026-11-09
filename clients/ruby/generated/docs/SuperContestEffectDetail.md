# PokeApiClient::SuperContestEffectDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **appeal** | **Integer** | The level of appeal this super contest effect has. |  |
| **flavor_text_entries** | [**Array&lt;SuperContestEffectFlavorText&gt;**](SuperContestEffectFlavorText.md) | The flavor text of this super contest effect listed in different languages. | [readonly] |
| **moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that have the effect when used in super contests. | [readonly] |

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

