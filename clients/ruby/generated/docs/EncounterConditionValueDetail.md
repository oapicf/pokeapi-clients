# PokeApiClient::EncounterConditionValueDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **condition** | [**EncounterConditionSummary**](EncounterConditionSummary.md) | The condition this encounter condition value pertains to. |  |
| **names** | [**Array&lt;EncounterConditionValueName&gt;**](EncounterConditionValueName.md) | The name of this resource listed in different languages. | [readonly] |

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

