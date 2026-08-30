# PokeApiClient::BerryFirmnessDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **berries** | [**Array&lt;BerrySummary&gt;**](BerrySummary.md) |  | [readonly] |
| **names** | [**Array&lt;BerryFirmnessName&gt;**](BerryFirmnessName.md) |  | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::BerryFirmnessDetail.new(
  id: null,
  name: null,
  berries: null,
  names: null
)
```

