# PokeApiClient::EncounterConditionDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **values** | [**Array&lt;EncounterConditionValueSummary&gt;**](EncounterConditionValueSummary.md) |  |  |
| **names** | [**Array&lt;EncounterConditionName&gt;**](EncounterConditionName.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::EncounterConditionDetail.new(
  id: null,
  name: null,
  values: null,
  names: null
)
```

