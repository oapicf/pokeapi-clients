# PokeApiClient::ItemPocketDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **categories** | [**Array&lt;ItemCategorySummary&gt;**](ItemCategorySummary.md) |  | [readonly] |
| **names** | [**Array&lt;ItemPocketName&gt;**](ItemPocketName.md) |  | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::ItemPocketDetail.new(
  id: null,
  name: null,
  categories: null,
  names: null
)
```

