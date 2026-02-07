# PokeApiClient::MoveDamageClassDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **descriptions** | [**Array&lt;MoveDamageClassDescription&gt;**](MoveDamageClassDescription.md) |  |  |
| **moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) |  |  |
| **names** | [**Array&lt;MoveDamageClassName&gt;**](MoveDamageClassName.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::MoveDamageClassDetail.new(
  id: null,
  name: null,
  descriptions: null,
  moves: null,
  names: null
)
```

