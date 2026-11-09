# PokeApiClient::MoveMetaCategoryDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **descriptions** | [**Array&lt;MoveMetaCategoryDescription&gt;**](MoveMetaCategoryDescription.md) | The description of this resource listed in different languages. | [readonly] |
| **moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that fall into this category. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::MoveMetaCategoryDetail.new(
  id: null,
  name: null,
  descriptions: null,
  moves: null
)
```

