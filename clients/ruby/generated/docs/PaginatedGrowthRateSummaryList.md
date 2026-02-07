# PokeApiClient::PaginatedGrowthRateSummaryList

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **count** | **Integer** |  | [optional] |
| **_next** | **String** |  | [optional] |
| **previous** | **String** |  | [optional] |
| **results** | [**Array&lt;GrowthRateSummary&gt;**](GrowthRateSummary.md) |  | [optional] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PaginatedGrowthRateSummaryList.new(
  count: 123,
  _next: http://api.example.org/accounts/?offset&#x3D;400&amp;limit&#x3D;100,
  previous: http://api.example.org/accounts/?offset&#x3D;200&amp;limit&#x3D;100,
  results: null
)
```

