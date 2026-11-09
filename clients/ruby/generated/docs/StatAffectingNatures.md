# PokeApiClient::StatAffectingNatures

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **increase** | [**Array&lt;NatureSummary&gt;**](NatureSummary.md) | A list of natures and how they change the referenced stat. |  |
| **decrease** | [**Array&lt;NatureSummary&gt;**](NatureSummary.md) | A list of nature sand how they change the referenced stat. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::StatAffectingNatures.new(
  increase: null,
  decrease: null
)
```

