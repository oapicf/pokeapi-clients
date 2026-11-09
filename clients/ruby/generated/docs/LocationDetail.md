# PokeApiClient::LocationDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **region** | [**RegionSummary**](RegionSummary.md) | The region this location can be found in. |  |
| **names** | [**Array&lt;LocationName&gt;**](LocationName.md) | The name of this resource listed in different languages. | [readonly] |
| **game_indices** | [**Array&lt;LocationGameIndex&gt;**](LocationGameIndex.md) | A list of game indices relevent to this location by generation. | [readonly] |
| **areas** | [**Array&lt;LocationAreaSummary&gt;**](LocationAreaSummary.md) | Areas that can be found within this location. | [readonly] |

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

