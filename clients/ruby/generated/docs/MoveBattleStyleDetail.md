# PokeApiClient::MoveBattleStyleDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **names** | [**Array&lt;MoveBattleStyleName&gt;**](MoveBattleStyleName.md) | The name of this resource listed in different languages. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::MoveBattleStyleDetail.new(
  id: null,
  name: null,
  names: null
)
```

