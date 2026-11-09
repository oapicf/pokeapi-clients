# PokeApiClient::MoveComboUsage

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **use_before** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves to use before this move. |  |
| **use_after** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves to use after this move. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::MoveComboUsage.new(
  use_before: null,
  use_after: null
)
```

