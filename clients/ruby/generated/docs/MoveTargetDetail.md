# PokeApiClient::MoveTargetDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **descriptions** | [**Array&lt;MoveTargetDescription&gt;**](MoveTargetDescription.md) |  |  |
| **moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) |  |  |
| **names** | [**Array&lt;MoveTargetName&gt;**](MoveTargetName.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::MoveTargetDetail.new(
  id: null,
  name: null,
  descriptions: null,
  moves: null,
  names: null
)
```

