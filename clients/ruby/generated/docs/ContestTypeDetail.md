# PokeApiClient::ContestTypeDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **berry_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  | [readonly] |
| **names** | [**Array&lt;ContestTypeName&gt;**](ContestTypeName.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::ContestTypeDetail.new(
  id: null,
  name: null,
  berry_flavor: null,
  names: null
)
```

