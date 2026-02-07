# PokeApiClient::BerryDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **growth_time** | **Integer** |  |  |
| **max_harvest** | **Integer** |  |  |
| **natural_gift_power** | **Integer** |  |  |
| **size** | **Integer** |  |  |
| **smoothness** | **Integer** |  |  |
| **soil_dryness** | **Integer** |  |  |
| **firmness** | [**BerryFirmnessSummary**](BerryFirmnessSummary.md) |  |  |
| **flavors** | [**Array&lt;BerryDetailFlavorsInner&gt;**](BerryDetailFlavorsInner.md) |  |  |
| **item** | [**ItemSummary**](ItemSummary.md) |  |  |
| **natural_gift_type** | [**TypeSummary**](TypeSummary.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::BerryDetail.new(
  id: null,
  name: null,
  growth_time: null,
  max_harvest: null,
  natural_gift_power: null,
  size: null,
  smoothness: null,
  soil_dryness: null,
  firmness: null,
  flavors: null,
  item: null,
  natural_gift_type: null
)
```

