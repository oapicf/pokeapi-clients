# PokeApiClient::EncounterConditionDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **values** | [**Array&lt;EncounterConditionValueSummary&gt;**](EncounterConditionValueSummary.md) | A list of possible values for this encounter condition. | [readonly] |
| **names** | [**Array&lt;EncounterConditionName&gt;**](EncounterConditionName.md) | The name of this resource listed in different languages. | [readonly] |

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

