# PokeApiClient::ItemPocketDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **categories** | [**Array&lt;ItemCategorySummary&gt;**](ItemCategorySummary.md) | A list of item categories that are relevant to this item pocket. | [readonly] |
| **names** | [**Array&lt;ItemPocketName&gt;**](ItemPocketName.md) | The name of this resource listed in different languages. | [readonly] |

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

