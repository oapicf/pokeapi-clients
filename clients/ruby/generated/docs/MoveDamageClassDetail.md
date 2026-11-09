# PokeApiClient::MoveDamageClassDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **descriptions** | [**Array&lt;MoveDamageClassDescription&gt;**](MoveDamageClassDescription.md) | The description of this resource listed in different languages. | [readonly] |
| **moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that fall into this damage class. | [readonly] |
| **names** | [**Array&lt;MoveDamageClassName&gt;**](MoveDamageClassName.md) | The name of this resource listed in different languages. | [readonly] |

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

