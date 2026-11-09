# PokeApiClient::ItemAttributeDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **descriptions** | [**Array&lt;ItemAttributeDescription&gt;**](ItemAttributeDescription.md) | The description of this item attribute listed in different languages. | [readonly] |
| **items** | [**Array&lt;ItemSummary&gt;**](ItemSummary.md) | A list of items that have this attribute. | [readonly] |
| **names** | [**Array&lt;ItemAttributeName&gt;**](ItemAttributeName.md) | The name of this item attribute listed in different languages. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::ItemAttributeDetail.new(
  id: null,
  name: null,
  descriptions: null,
  items: null,
  names: null
)
```

