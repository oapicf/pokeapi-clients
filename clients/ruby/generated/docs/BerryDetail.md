# PokeApiClient::BerryDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **growth_time** | **Integer** | Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. | [optional] |
| **max_harvest** | **Integer** | The maximum number of these berries that can grow on one tree in Generation IV. | [optional] |
| **natural_gift_power** | **Integer** | The power of the move \&quot;Natural Gift\&quot; when used with this Berry. | [optional] |
| **size** | **Integer** | The size of this Berry, in millimeters. | [optional] |
| **smoothness** | **Integer** | The smoothness of this Berry, used in making Pokéblocks or Poffins. | [optional] |
| **soil_dryness** | **Integer** | The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. | [optional] |
| **firmness** | [**BerryFirmnessSummary**](BerryFirmnessSummary.md) | The firmness of this berry, used in making Pokéblocks or Poffins. |  |
| **flavors** | [**Array&lt;BerryFlavorMap&gt;**](BerryFlavorMap.md) | A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. | [readonly] |
| **item** | [**ItemSummary**](ItemSummary.md) | Berries are actually items. This is a reference to the item specific data for this berry. |  |
| **natural_gift_type** | [**TypeSummary**](TypeSummary.md) | The type inherited by \&quot;Natural Gift\&quot; when used with this Berry. |  |

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

