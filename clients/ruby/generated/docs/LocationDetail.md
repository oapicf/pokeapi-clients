# PokeApiClient::LocationDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **region** | [**RegionSummary**](RegionSummary.md) |  |  |
| **names** | [**Array&lt;LocationName&gt;**](LocationName.md) |  | [readonly] |
| **game_indices** | [**Array&lt;LocationGameIndex&gt;**](LocationGameIndex.md) |  | [readonly] |
| **areas** | [**Array&lt;LocationAreaSummary&gt;**](LocationAreaSummary.md) |  | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::LocationDetail.new(
  id: null,
  name: null,
  region: null,
  names: null,
  game_indices: null,
  areas: null
)
```

