# PokeApiClient::PaginatedEvolutionChainSummaryList

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **count** | **Integer** | The total number of resources available from this API. |  |
| **_next** | **String** | The URL for the next page in the list, or null if there is no next page. | [optional] |
| **previous** | **String** | The URL for the previous page in the list, or null if there is no previous page. | [optional] |
| **results** | [**Array&lt;EvolutionChainSummary&gt;**](EvolutionChainSummary.md) | A list of API resources on this page. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PaginatedEvolutionChainSummaryList.new(
  count: 100,
  _next: https://pokeapi.co/api/v2/evolution-chain/?offset&#x3D;40&amp;limit&#x3D;20,
  previous: https://pokeapi.co/api/v2/evolution-chain/?offset&#x3D;0&amp;limit&#x3D;20,
  results: null
)
```

