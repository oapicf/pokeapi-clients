# PokeApiClient::EncounterConditionValueDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **condition** | [**EncounterConditionSummary**](EncounterConditionSummary.md) |  |  |
| **names** | [**Array&lt;EncounterConditionValueName&gt;**](EncounterConditionValueName.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::EncounterConditionValueDetail.new(
  id: null,
  name: null,
  condition: null,
  names: null
)
```

