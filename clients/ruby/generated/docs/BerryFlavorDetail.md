# PokeApiClient::BerryFlavorDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **berries** | [**Array&lt;BerryFlavorDetailBerriesInner&gt;**](BerryFlavorDetailBerriesInner.md) |  | [readonly] |
| **contest_type** | [**ContestTypeSummary**](ContestTypeSummary.md) |  |  |
| **names** | [**Array&lt;BerryFlavorName&gt;**](BerryFlavorName.md) |  | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::BerryFlavorDetail.new(
  id: null,
  name: null,
  berries: null,
  contest_type: null,
  names: null
)
```

