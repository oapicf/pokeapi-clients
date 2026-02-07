# PokeApiClient::ItemCategoryDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **items** | [**Array&lt;ItemSummary&gt;**](ItemSummary.md) |  |  |
| **names** | [**Array&lt;ItemCategoryName&gt;**](ItemCategoryName.md) |  |  |
| **pocket** | [**ItemPocketSummary**](ItemPocketSummary.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::ItemCategoryDetail.new(
  id: null,
  name: null,
  items: null,
  names: null,
  pocket: null
)
```

