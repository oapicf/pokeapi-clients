# PokeApiClient::MoveTargetDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **descriptions** | [**Array&lt;MoveTargetDescription&gt;**](MoveTargetDescription.md) | The description of this resource listed in different languages. | [readonly] |
| **moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that that are directed at this target. | [readonly] |
| **names** | [**Array&lt;MoveTargetName&gt;**](MoveTargetName.md) | The name of this resource listed in different languages. | [readonly] |

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

