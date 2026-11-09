# PokeApiClient::ItemCategoryDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **items** | [**Array&lt;ItemSummary&gt;**](ItemSummary.md) | A list of items that are a part of this category. | [readonly] |
| **names** | [**Array&lt;ItemCategoryName&gt;**](ItemCategoryName.md) | The name of this item category listed in different languages. | [readonly] |
| **pocket** | [**ItemPocketSummary**](ItemPocketSummary.md) | The pocket items in this category would be put in. |  |

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

